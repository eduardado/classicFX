# ClassicFX

[ejemplosAbel](https://gitlab.com/abel.ceu/interfaces-dam-jfx)

<details>
<summary>Requerimientos</summary>

Realizaremos una aplicación con dos pantallas:

    Pantalla 1:
        Tendrá filtros para poder buscar pedidos: fecha desde/hasta (orderDate) y estado (combo)
        Tabla de resultados con scroll
        Cuando hago doble click en un pedido, voy a la pantalla 2
        Botón salir para cerrar la aplicación
    Pantalla 2:
        Vemos el detalle del pedido:
            Fecha de pedido
            Comentarios en un textarea
            Lista de detalles (código de artículo, cantidad y precio) en una tabla
        Botón volver para regresar a la búsqueda

Poner el cariño y la dedicación suficiente para que la interfaz sea lo más usable posible.
</details>

<details>
<summary>Notas</summary>

1. Planteamos navegación.

</details>

<details>
<summary>Código Usado</summary>

## Clases y métodos
- Scene: setRoot();
- Stage: setScene(); show(); setResizable(); 
- FXMLLoader: load() 
- Parent: 
- Class: getResource(); : URL
- Application: launch()
- TextField: requestFocus()

## Anotaciones
@FXML-> Para acceder a elementos del fxml

</details>

<details>
<summary>Todo</summary>
- [ ] Plantear Navegacion: Login->Order->OrderDetails

</details>

<details>
<summary>Ideas</summary>
- [ ] Añadir clearScene a IController
</details>