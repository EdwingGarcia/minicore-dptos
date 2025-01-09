# Tutorial Filtrado por Fechas en Spring con MySQL

En este tutorial se explica lo básico para crear un proyecto Spring desde cero. Además, se muestra cómo filtrar y calcular datos dentro de un rango de fechas. El proyecto utiliza Spring Boot, MySQL y Thymeleaf para gestionar la interfaz de usuario.

## Características del Proyecto

- **Inyección de dependencias**: El proyecto utiliza el patrón de diseño de inyección de dependencias para gestionar las dependencias entre los componentes.
- **HTML con Thymeleaf**: La interfaz de usuario está construida usando Thymeleaf para permitir la renderización de datos en HTML.
- **Manejo de repositorios**: Se utiliza un repositorio con un método general para obtener y manipular datos desde MySQL.
- **Modelo de datos**: Se muestra cómo se gestionan los modelos en la base de datos y cómo se relacionan entre sí mediante claves foráneas.

## Estructura de Datos

### Insertar Departamentos

```sql
INSERT INTO departamento (nombre) VALUES 
('Recursos Humanos'),
('Finanzas'),
('Marketing'),
('Ventas'),
('Tecnología de la Información'),
('Operaciones'),
('Producción'),
('Investigación y Desarrollo'),
('Atención al Cliente'),
('Legal'),
('Logística'),
('Calidad'),
('Planificación Estratégica'),
('Comunicación Corporativa'),
('Compras');
```
### Insertar Gastos

```sql
INSERT INTO gasto (fecha, descripcion, monto, id_empleado, id_departamento) VALUES
('2025-01-01', 'Compra de materiales de oficina', 500.00, 1, 1),
('2025-01-02', 'Gasto en publicidad digital', 1500.00, 2, 3),
('2025-01-03', 'Pago de servicios de internet', 200.00, 3, 5),
('2025-01-04', 'Compra de equipos informáticos', 3000.00, 4, 6),
('2025-01-05', 'Gastos en transporte para clientes', 250.00, 5, 2),
('2025-01-06', 'Material de oficina para el departamento de ventas', 350.00, 6, 4),
('2025-01-07', 'Gasto de capacitación para personal', 800.00, 7, 7),
('2025-01-08', 'Mantenimiento de equipos', 600.00, 8, 8),
('2025-01-09', 'Revisión y auditoría financiera', 1000.00, 9, 9),
('2025-01-10', 'Gastos en investigación de mercado', 1200.00, 10, 3),
('2025-01-11', 'Gasto en herramientas de comunicación', 450.00, 11, 10),
('2025-01-12', 'Pago a proveedores', 5000.00, 12, 2),
('2025-01-13', 'Comida para reunión de personal', 300.00, 13, 4),
('2025-01-14', 'Gasto en software de gestión', 1200.00, 14, 5),
('2025-01-15', 'Consultoría externa en calidad', 1500.00, 15, 6);
```

### Insertar Empleados

```sql
INSERT INTO empleado (nombre) VALUES 
('Juan Pérez'),
('María López'),
('Carlos García'),
('Ana Martínez'),
('Luis Hernández'),
('Sofía González'),
('Miguel Ramírez'),
('Laura Torres'),
('Jorge Díaz'),
('Elena Sánchez'),
('Pablo Castillo'),
('Lucía Fernández'),
('Fernando Ortega'),
('Claudia Morales'),
('Ricardo Reyes');
```

# Contactos

Si tienes alguna pregunta o comentario, no dudes en ponerte en contacto conmigo:

- **Correo Institucional**: [edwing.garcia@udla.edu.ec](mailto:edwing.garcia@udla.edu.ec)
- **Correo Personal**: [edwingnico@gmail.com](mailto:edwingnico@gmail.com)

# Enlace del Video Explicativo

# Enlace del Video Explicativo

- **Video**: [Click Aquí](https://udlaec-my.sharepoint.com/:v:/g/personal/edwing_garcia_udla_edu_ec/Ef7XadSUZUxJreS_vgFuXuoBXrLZm19_kAsBRSUek4yzdQ?e=sPSIky)

