import TopMenu from "@/components/TopMenu/top-menu";
import Carousel from "@/components/Home/carousel";

export default function Page() {
  return (
    <main>
      <div className="flex pt-20">
        <div className="">
          <Carousel />
        </div>
        <div className="pt-10 text-right">
          <h1 className="font-semibold text-sky-800 font-serif text-4xl text-center pt-5">
            Bienvenidos a nuestro Club
          </h1>
          <p className="text-center font-light font-serif text-2xl pt-5">
            5 deportes en un mismo lugar
          </p>
        </div>
        <div className=""></div>
      </div>
      <div>
          <div className="text-4xl font-semibold text-center text-sky-800 font-serif  pt-5 pt-10">
            <h1>Nuestros Deportes</h1>
          </div>
          <div>
            
          </div>
        </div>
    </main>
  );
}
