import Styled from "styled-components";

const StyledHome = Styled.div`
  width: 770px;
  margin: 0 auto;
  text-align: center;
  padding-top: 100px;
`;

const HomePage = () => {
  return (
    <StyledHome>
      <h1>Welcome to the Home Page</h1>
      <p>Once you eneter you can never leave</p>
    </StyledHome>
  );
};

export default HomePage;
