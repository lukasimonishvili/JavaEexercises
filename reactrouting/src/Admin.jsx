import Styled from "styled-components";

const StyledAdmin = Styled.div`
    width: 770px;
    margin: 0 auto;
    text-align: center;
    padding-top: 100px;
`;

const AdminPage = () => {
  return (
    <StyledAdmin>
      <h1>Admin Page</h1>
      <p>This is a cool kids table. Welcome dawg!</p>
    </StyledAdmin>
  );
};

export default AdminPage;
