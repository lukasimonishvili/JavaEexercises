import Styled from "styled-components";
import { useSearchParams, useNavigate } from "react-router-dom";

const StyledFilters = Styled.div`
    align-items: center;
    width: 100%;
`;

const Filters = () => {
  const [searchParams] = useSearchParams();
  const navigate = useNavigate();

  const updateQueryParam = (param, value) => {
    const params = new URLSearchParams(searchParams);

    if (value === "all") {
      params.delete(param);
    } else {
      params.set(param, value);
    }

    const newSearch = params.toString();
    const newUrl = `${window.location.pathname}${
      newSearch ? `?${newSearch}` : ""
    }`;
    navigate(newUrl, { replace: true });
  };

  const handleCategoryChange = (e) => {
    updateQueryParam("category", e.target.value);
  };

  const handleLevelChange = (e) => {
    updateQueryParam("level", e.target.value);
  };

  return (
    <StyledFilters>
      <label htmlFor="category">Category:</label>
      <select id="category" defaultValue="all" onChange={handleCategoryChange}>
        <option value="all">All</option>
        <option value="Programming">Programming</option>
        <option value="Data-Science">Data Science</option>
        <option value="Web-Development">Web Development</option>
        <option value="AI-&-Machine-Learning">AI & Machine Learning</option>
        <option value="Cloud">Cloud</option>
        <option value="Security">Security</option>
        <option value="DevOps">DevOps</option>
        <option value="Software-Engineering">Software Engineering</option>
      </select>
      <br />
      <label htmlFor="level">Level:</label>
      <select id="level" defaultValue="all" onChange={handleLevelChange}>
        <option value="all">All</option>
        <option value="basic">Basic</option>
        <option value="advanced">Advanced</option>
      </select>
    </StyledFilters>
  );
};

export default Filters;
