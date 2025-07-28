import Styled from "styled-components";

const StyledNotFound = Styled.div`
  width: 770px;
  margin: 0 auto;
  text-align: center;
  padding-top: 100px;
`;

const NotFoundPage = () => {
  return (
    <StyledNotFound>
      <h1>404 - Page Not Found</h1>
      <p>Get the fuck out of here!</p>
    </StyledNotFound>
  );
};

export default NotFoundPage;
