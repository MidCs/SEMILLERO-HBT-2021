package semillero.pruebasUnitarias;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import com.bht.semillero.enums.EstadoEnum;
import com.bht.semillero.enums.TematicaEnum;
import com.hbt.semillero.dto.ComicDTO;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author midac
 * @version
 */
public class CreacionComicTest {
	
	/**
	 * Se crea el atributo log para poder utilizarlo, util para los mensajes en la consola a medida que realizamos las pruebas unitarias
	 */
	private final static Logger log = Logger.getLogger(CreacionComicTest.class);
	
	@BeforeTest
	/**
	 * 
	 * Metodo encargado de realizar las configuraciones iniciales del Log, necesario para su funcionamiento, además de poner un encabezado
	 * <b>Caso de Uso</b>-
	 * @author Miguel Castaño
	 *
	 */
	public void init() {
		BasicConfigurator.configure();
		log.info(":::::::::::::::::::::::::::: INICIAN PRUEBAS UNITARIAS COMICS :::::::::::::::::::::::::::: ");
	}
	
	@Test
	/**
	 * 
	 * Metodo encargado de validar que la creación de uno o varios comics se realizan de forma exitosa
	 * <b>Caso de Uso</b>SEMILLERO 2021
	 * @author Miguel Castaño
	 *
	 */
	public void validarCreacionComic() {
		log.info("Inicia ejecucion del metodo validarCreacionComic()");
		

		
		

     	listaComics.add(new ComicDTO("01", "Superman", "DC", TematicaEnum.AVENTURAS, "Nueva", Integer.valueOf(100), BigDecimal.valueOf(50000), "Jerry Siegel", true, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("02", "Batman", "DC", TematicaEnum.BELICO, "Nueva", Integer.valueOf(110), BigDecimal.valueOf(51000), "Pedro", false, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("03", "Aquaman", "DC", TematicaEnum.FANTASTICO, "Nueva", Integer.valueOf(120), BigDecimal.valueOf(52000), "Pablo", true, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("03", "Aquaman", "DC", TematicaEnum.AVENTURAS, "Nueva", Integer.valueOf(120), BigDecimal.valueOf(52000), "Pablo", true, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("04", "WonderWoman", "DC", TematicaEnum.DEPORTIVO, "Nueva", Integer.valueOf(130), BigDecimal.valueOf(53000), "Lucas", false, EstadoEnum.INACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("05", "Flash", "DC", TematicaEnum.FANTASTICO, "Nueva", Integer.valueOf(140), BigDecimal.valueOf(54000), "Henry", false, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("06", "Iron Man", "Marvel", TematicaEnum.CIENCIA_FICCION, "Nueva", Integer.valueOf(150), BigDecimal.valueOf(55000), "Ana", true, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("07", "Cap America", "Marvel", TematicaEnum.HISTORICO, "Nueva", Integer.valueOf(160), BigDecimal.valueOf(56000), "Teresa", false, EstadoEnum.INACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("08", "Hulk", "Marvel", TematicaEnum.HORROR, "Nueva", Integer.valueOf(170), BigDecimal.valueOf(57000), "Elvira", false, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("09", "Thor", "Marvel", TematicaEnum.AVENTURAS, "Nueva", Integer.valueOf(180), BigDecimal.valueOf(58000), "Julieta", true, EstadoEnum.ACTIVO, Long.valueOf(20L)));
		listaComics.add(new ComicDTO("10", "Viuda Negra", "Marvel", TematicaEnum.BELICO, "Nueva", Integer.valueOf(190), BigDecimal.valueOf(59000), "Maradona", false, EstadoEnum.INACTIVO, Long.valueOf(20L)));
		
		try {
			
			verificarComicsActivos(listaComics);
			verificarComicsInactivos(listaComics);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
				
		
		log.info("Finaliza la ejecucion del metodo validarCreacionComic()");
	}
	
	@Test	
	/**
	 * 
	 * Metodo encargado de retornar los comics que están activos 
	 * <b>Caso de Uso</b>SEMILLERO 2021
	 * @author Miguel Castaño
	 * 
	 * @param listaComics ->Lista de comics para revisar su estado
	 * @return comicsActivos-> Lista de comics activos de listaComics
	 */
	private ArrayList<ComicDTO> verificarComicsActivos(ArrayList<ComicDTO> listaComics){
		
		log.info("Inicia ejecucion del metodo verificarComicsActivos()");
		ArrayList<ComicDTO> comicsActivos = new ArrayList<ComicDTO>();
		
		for (ComicDTO comic: listaComics) {
			if(comic.getEstadoEnum().equals(EstadoEnum.ACTIVO)) { //Comparamos con el enumerador
				Assert.assertEquals(comic.getEstadoEnum(), EstadoEnum.ACTIVO); //Prueba unitaria para verificar los comics activos
				System.out.println(comic.toString()); //Imprimimos los datos del comic
				comicsActivos.add(comic); //Añadimos a la lista de comics activos
			}
		}
		
		log.info("Termina ejecucion del metodo verificarComicsActivos()");
		return comicsActivos;
	}
	
	
	@Test
	/**
	 * 
	 * Metodo encargado de retornar los comics que están inactivos 
	 * <b>Caso de Uso</b>SEMILLERO 2021
	 * @author midac
	 * 
	 * @param listaComics-> Lista de comics para revisar su estado
	 * @return comicsActivos-> Lista de comics inactivos de listaComics
	 * @throws Exception 
	 */
	private ArrayList<ComicDTO> verificarComicsInactivos(ArrayList<ComicDTO> listaComics) throws Exception{
		
		log.info("Inicia ejecucion del metodo verificarComicsInactivos()");
		
		ArrayList<ComicDTO> comicsInactivos = new ArrayList<ComicDTO>();
		ArrayList<String> nombComicsInactivos = new ArrayList<String>();
		
		for (ComicDTO comic: listaComics) {
			if(comic.getEstadoEnum().equals(EstadoEnum.INACTIVO)) { //Comparamos con el enumerador				
				Assert.assertEquals(comic.getEstadoEnum(), EstadoEnum.INACTIVO); //Prueba unitaria para verificar los comics Inactivos
				comicsInactivos.add(comic); //Examinar  la lista de inactivos
				nombComicsInactivos.add(comic.getNombre()); //Añadir a la lista de nombres de comics inactivos
			}
		}
		
		
		int tamanioListaTotal = listaComics.size();
		int numeroTotalActivos = listaComics.size() - comicsInactivos.size();
		int numeroTotalInactivos = comicsInactivos.size();
		String nombresComicsInactivos = nombComicsInactivos.toString();
		
		String message = "Se ha detectado que de " + tamanioListaTotal + " comics se encontraron que " + numeroTotalActivos + "  se encuentran activos y " + numeroTotalInactivos + " inactivos. Los comics inactivos son: " + nombresComicsInactivos;
		System.out.println(message); 
		
		for (ComicDTO comic: comicsInactivos) {
			if(comic.getEstadoEnum().equals(EstadoEnum.ACTIVO)) {			
				throw new Exception(message);
			}
		}
		
		log.info("Termina ejecucion del metodo verificarComicsInactivos()");
		
		return comicsInactivos;
	}
	
	@AfterTest
	/**
	 * 
	 * Metodo para terminar las pruebas unitarias
	 * <b>Caso de Uso</b>
	 * @author Miguel
	 *
	 */
	public void finalizaPruebasUnitarias() {
		log.info(":::::::::::::::::::::::::::: FINALIZAN PRUEBAS UNITARIAS COMICS :::::::::::::::::::::::::::: ");
	}

}
