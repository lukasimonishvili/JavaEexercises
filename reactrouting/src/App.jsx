import Footer from "./Footer";
import Header from "./Header";
import Styled from "styled-components";
import Routing from "./Routing";

const StyledSpacer = Styled.main`
  width: 100%;
  min-height: calc(100vh - 260px);
  margin-top: 60px;
`;

function App() {
  return (
    <>
      <Header />
      <StyledSpacer>
        <Routing />
      </StyledSpacer>
      <Footer />
    </>
  );
}

export default App;
