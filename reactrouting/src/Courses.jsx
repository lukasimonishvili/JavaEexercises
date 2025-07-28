import Styled from "styled-components";
import coursesData from "./assets/courses.json";
import { useState, useEffect, use } from "react";
import { Link, useSearchParams } from "react-router-dom";
import Filters from "./Filters";

const StyledCourses = Styled.div`
    width: 1100px;
    margin: 0 auto;
    padding-top: 100px;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    align-items: center;

    & > h1 {
        width: 100%;
        text-align: center;
    }
`;

const StyledCourse = Styled.div`
    width: 30%;
    height: 140px;
    border: 1px solid black;
    padding: 20px;
    margin-top: 20px;

    & > a {
        display: block;
        text-align: end;
    }
`;

const Courses = () => {
  const [courses, setCourses] = useState(coursesData);
  const [searchParams] = useSearchParams();

  useEffect(() => {
    if (!searchParams.size) {
      setCourses(coursesData);
      return;
    }
    const filteredCourses = coursesData.filter((course) => {
      const categoryMatch =
        !searchParams.get("category") ||
        course.category === searchParams.get("category");
      const levelMatch =
        !searchParams.get("level") ||
        course.level === searchParams.get("level");
      return categoryMatch && levelMatch;
    });
    setCourses(filteredCourses);
  }, [searchParams]);
  return (
    <StyledCourses>
      <h1>Shitty courses</h1>
      <Filters />
      {courses.map((course) => (
        <StyledCourse key={course.id}>
          <h2>{course.title}</h2>
          <p>category: {course.category}</p>
          <p>level: {course.level}</p>
          <Link to={`/course/${course.id}`}>See details</Link>
        </StyledCourse>
      ))}
    </StyledCourses>
  );
};

export default Courses;
