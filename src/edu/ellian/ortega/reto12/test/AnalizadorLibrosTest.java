package edu.ellian.ortega.reto12.test;
import static org.junit.Assert.*;
import edu.ellian.ortega.reto12.process.AnalizadorLibros;
import edu.ellian.ortega.reto12.process.Libro;
import org.junit.*;

public class AnalizadorLibrosTest {
    private AnalizadorLibros analizador;

    @Before
    public void setUp() {
        analizador = new AnalizadorLibros("español");
    }

    @Test
    public void testAnalizarLibroLibroVacio() {
        Libro libroVacio = new Libro("");
        analizador.analizarLibro(libroVacio);
        assertTrue(analizador.getConteoPalabras().isEmpty());
        assertEquals(0, analizador.getConteoVocales());
    }

    @Test
    public void testAnalizarLibroSinPalabrasCumplenFiltro() {
        Libro libroSinPalabras = new Libro("1234 !@#$");
        analizador.analizarLibro(libroSinPalabras);
        assertFalse(analizador.existePalabraCumpleCondiciones());
        assertEquals(0, analizador.getConteoVocales());
    }

    @Test
    public void testAnalizarLibroConPalabrasCumplenFiltro() {
        Libro libroConPalabras = new Libro("abecezaiou patatu asdfg");
        analizador.analizarLibro(libroConPalabras);
        assertTrue(analizador.existePalabraCumpleCondiciones());
        assertEquals(9, analizador.getConteoVocales());
    }

    @Test
    public void testTopPalabras() {
        Libro libroEjemplo = new Libro("hola hola hola mundo mundo mundo mundo");
        analizador.analizarLibro(libroEjemplo);
        analizador.mostrarTopPalabras(2);

        // Simplemente verificamos que no se lance una excepción al ejecutar el método
    }

    @Test
    public void testImprimirPalabrasVocalesOrdenadas() {
        Libro libroEjemplo = new Libro("abecezaiou patatu asdfg");
        analizador.analizarLibro(libroEjemplo);
        analizador.imprimirPalabrasVocalesOrdenadas();

        // Simplemente verificamos que no se lance una excepción al ejecutar el método
    }

    @Test
    public void testImprimirPalabrasImparLetras() {
        Libro libroEjemplo = new Libro("abecezaiou patatu asdfg");
        analizador.analizarLibro(libroEjemplo);
        analizador.imprimirPalabrasImparLetras();

        // Simplemente verificamos que no se lance una excepción al ejecutar el método
    }

    @Test
    public void testEncontrarPalabraMasLarga() {
        Libro libroEjemplo = new Libro("hola mundo");
        analizador.analizarLibro(libroEjemplo);
        assertEquals("mundo", analizador.encontrarPalabraMasLarga());
    }

    @Test
    public void testEncontrarPalabraMasCorta() {
        Libro libroEjemplo = new Libro("hola mundo");
        analizador.analizarLibro(libroEjemplo);
        assertEquals("hola", analizador.encontrarPalabraMasCorta());
    }

    @Test
    public void testExistePalabraCumpleCondiciones() {
        Libro libroEjemplo = new Libro("abecezaiou patatu asdfg");
        analizador.analizarLibro(libroEjemplo);
        assertTrue(analizador.existePalabraCumpleCondiciones());
    }

    @Test
    public void testPalabrasImparLetras() {
        Libro libroEjemplo = new Libro("hola mundo ab cd efghi");
        analizador.analizarLibro(libroEjemplo);
        analizador.imprimirPalabrasImparLetras();
    }

    @Test
    public void testEncontrarPalabraMasLargaVacia() {
        Libro libroVacio = new Libro("");
        analizador.analizarLibro(libroVacio);
        assertEquals("", analizador.encontrarPalabraMasLarga());
    }

    @Test
    public void testEncontrarPalabraMasCortaVacia() {
        Libro libroVacio = new Libro("");
        analizador.analizarLibro(libroVacio);
        assertEquals("", analizador.encontrarPalabraMasCorta());
    }

    @Test
    public void testExistePalabraCumpleCondicionesVacia() {
        Libro libroVacio = new Libro("");
        analizador.analizarLibro(libroVacio);
        assertFalse(analizador.existePalabraCumpleCondiciones());
    }

    @Test
    public void testConteoVocales() {
        Libro libroEjemplo = new Libro("aeiouáéíóúüñ");
        analizador.analizarLibro(libroEjemplo);
        assertEquals(12, analizador.getConteoVocales());
    }

    @Test
    public void testPalabrasVocalesOrdenadas() {
        Libro libroEjemplo = new Libro("hola ola ala eleli ululu");
        analizador.analizarLibro(libroEjemplo);
        analizador.imprimirPalabrasVocalesOrdenadas(); // Debería imprimir "ala", "eleli", "ola", "ululu"
        // Aquí puedes agregar más aserciones para validar el resultado esperado
    }

    @Test
    public void testPalabraMasLarga() {
        Libro libroEjemplo = new Libro("a aa aaa aaaa aaaaa aaaaaa");
        analizador.analizarLibro(libroEjemplo);
        assertEquals("aaaaaaa", analizador.encontrarPalabraMasLarga());
    }

    @Test
    public void testPalabraMasCorta() {
        Libro libroEjemplo = new Libro("aaaaa aa aaa a a");
        analizador.analizarLibro(libroEjemplo);
        assertEquals("a", analizador.encontrarPalabraMasCorta());
    }

    @Test
    public void testPalabrasImparLetrasVacias() {
        Libro libroVacio = new Libro("");
        analizador.analizarLibro(libroVacio);
        analizador.imprimirPalabrasImparLetras(); // No debería imprimir nada
    }

    @Test
    public void testExistePalabraCumpleCondicionesNoCumple() {
        Libro libroEjemplo = new Libro("palabra");
        analizador.analizarLibro(libroEjemplo);
        assertFalse(analizador.existePalabraCumpleCondiciones());
    }

    @Test
    public void testExistePalabraCumpleCondicionesCumple() {
        Libro libroEjemplo = new Libro("abcde");
        analizador.analizarLibro(libroEjemplo);
        assertTrue(analizador.existePalabraCumpleCondiciones());
    }

    @Test
    public void testTopPalabrasMayorQueCantidad() {
        Libro libroEjemplo = new Libro("hola hola hola mundo mundo mundo mundo");
        analizador.analizarLibro(libroEjemplo);
        analizador.mostrarTopPalabras(10); // Solo hay 2 palabras únicas, debería mostrar solo 2
        // Aquí puedes agregar más aserciones para validar el resultado esperado
    }

    @Test
    public void testTopPalabrasMenorQueCantidad() {
        Libro libroEjemplo = new Libro("hola hola hola mundo mundo mundo mundo");
        analizador.analizarLibro(libroEjemplo);
        analizador.mostrarTopPalabras(1); // Solo hay 2 palabras únicas, debería mostrar solo 1
        // Aquí puedes agregar más aserciones para validar el resultado esperado
    }

    @Test
    public void testTopPalabrasVacio() {
        Libro libroVacio = new Libro("");
        analizador.analizarLibro(libroVacio);
        analizador.mostrarTopPalabras(5); // No debería imprimir nada
    }

    @Test
    public void testTopPalabrasOrdenCorrecto() {
        Libro libroEjemplo = new Libro("hola hola mundo mundo hola hola");
        analizador.analizarLibro(libroEjemplo);
        analizador.mostrarTopPalabras(2); // Debería mostrar "hola" primero y "mundo" después
        // Aquí puedes agregar más aserciones para validar el resultado esperado
    }

    @After
    public void tearDown() {
        analizador = null;
    }
}
