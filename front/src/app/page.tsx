import TopMenu from "@/components/TopMenu/top-menu";
import Carousel from "@/components/Home/carousel";

export default function Page() {
  return (
    <main>
      <div className="flex">
        <div className="">
          <Carousel />
        </div>
        <div className="pt-20 pr-10 font-semibold text-sky-800 font-serif text-4xl">
          <h1>Bienvenidos a nuestro Club</h1>
        </div>
      </div>
    </main>
  );
}
