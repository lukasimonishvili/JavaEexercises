import { Route, Routes } from "react-router-dom";
import HomePage from "./Home";
import LoginPage from "./Login";
import NotFoundPage from "./NotFoundPage";
import { useUser } from "./UserContext";
import Courses from "./Courses";
import AdminPage from "./Admin";
import Course from "./Course";

const Routing = () => {
  const { user } = useUser();
  return (
    <Routes>
      <Route path="/" element={<HomePage />} />
      {user ? (
        <>
          <Route path="/courses" element={<Courses />} />
          <Route path="/course/:id" element={<Course />} />
        </>
      ) : (
        <>
          <Route path="/login" element={<LoginPage />} />
        </>
      )}
      {user && user.role === "admin" && (
        <Route path="/admin" element={<AdminPage />} />
      )}
      <Route path="*" element={<NotFoundPage />} />
    </Routes>
  );
};

export default Routing;
