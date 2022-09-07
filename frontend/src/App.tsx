import NotificationButton from "./assets/components/NotificationButton"
import SalesCard from "./assets/components/SalesCard"
import Header from "./assets/components/Header"

function App() {
  return (
    <>
      <Header />

      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />
          </div>
        </section>
      </main>


    </>
  )
}

export default App
