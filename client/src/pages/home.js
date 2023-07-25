import {PrimaryButton} from "../components/buttons";
import "./home.css"

const Home = () => {
    return (
        <div className="container fade-page">
            <div className="hero-banner">
                    <div className="hero-txt-area">
                        <h1>React, Java, Postgres Template</h1>
                        <p>Create, show, update and delete books,</p>
                        <p>but you should change or add on to continue your own project.</p>
                        <p>Hope this helps!</p>
                        <p>Ilia</p>
                    </div>
                    <PrimaryButton />
                </div>
            </div>
    );
}

export default Home;