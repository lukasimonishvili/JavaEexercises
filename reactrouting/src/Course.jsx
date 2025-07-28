import { useEffect, useState } from "react";
import Styled from "styled-components";
import { useParams } from "react-router-dom";
import courseData from "./assets/courses.json";

const StyledCourse = Styled.div`
    width: 770px;
    margin: 0 auto;
    text-align: center;
    padding-top: 100px;
`;

const Course = () => {
  const [notFound, setNotFound] = useState(false);
  const { id } = useParams();
  const [course, setCourse] = useState(null);

  useEffect(() => {
    for (const course of courseData) {
      if (course.id === id) {
        setCourse(course);
        return;
      }
    }
    setNotFound(true);
  }, []);
  return (
    <StyledCourse>
      {notFound ? (
        <h1>Course not found</h1>
      ) : (
        <>
          {!course ? (
            <h1>It's loading. calm your ass</h1>
          ) : (
            <>
              <h1>{course.title}</h1>
              <h2>Price: {course.price}$</h2>
              <h3>category: {course.category}</h3>
              <h4>level: {course.level}</h4>
              <p>{course.description}</p>
            </>
          )}
        </>
      )}
    </StyledCourse>
  );
};

export default Course;
