# Examen Técnico
# # Front End
# # # Actualizar a la ultima versión de Angular
Realice los distintos metodos en la pagina de <a href="https://angular.io/">Angular</a>

La version de los componentes al momento de ejecutar el examen tecnico son de;
<table>
<thead>
<tr>
<th>Package</th>
<th>Version</th>
</tr>
<thead>
<tbody>
<tr>
<td>@angular-devkit/architect</td>
<td>0.1703.5</td>
</tr>
<tr>
<td>@angular-devkit/build-angular</td>
<td>17.3.5</td>
</tr>
<tr>
<td>@angular-devkit/core</td>
<td>17.3.5</td>
</tr>
<tr>
<td>@angular-devkit/schematics</td>
<td>17.3.5</td>
</tr>
<tr>
<td>@schematics/angular</td>
<td>17.3.5</td>
</tr>
<tr>
<td>rxjs</td>
<td>7.8.1</td>
</tr>
<tr>
<td>typescript</td>
<td>5.4.5</td>
</tr>
<tr>
<td>zone.js</td>
<td>0.14.4</td>
</tr>
</tbody>
</table>

# # # Ejecutar codigos
Chequear versionado;<br>
<code>ng v</code><br>
Ejecutar FrontEnd;
<code>
cd .\frontEnd-SpringAngular\
ng serve
</code>
Para mantener los datos presentes en el FRONT utilice la API de <a href="https://api.openchargemap.io/v3/poi/?output=json&countrycode=CL?key=5dc9be8d-6af7-43e0-822c-856923d71485">openchargemap</a>

# # Backend
Para asegurar de que el backend funcione correctamente recuerda tener instalada la ultima version de MySQL, JDK y un IDE que ejecute el codigo de SpringBoot.

# Creación de un proyecto SPRING
Creamos un proyecto SpringBoot Maven con el que trabajaremos, añadimos las dependencias necesarias del archivo (POM.XML)
<code>
{
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
}
</code>
En el codigo ya estan las dependencias que vamos a utilizar, en el archivo 'application.properties' se configura la conexion a la base de datos
este archivo se encuentra en la ruta;
<code>
    techTest\src\main\resources\application.properties
<code>
He decidido aplicar con una Base de datos MYSQL ya que la rapidez de su ejecución sobre una aplicación Spring es notable, independiente de ello se puede modificar para ser una Base de datos Postgres con facilidad.

# # Base de datos

Creamos una base de datos llamada Electromobility
Esta contiene una tabla llamada charge_points con las siguientes columnas
o id como PK autoincremental
o status de tipo varchar
o operator de tipo varchar
o connections de tipo integer
o latitude de tipo varchar
o longitude de tipo varchar
o country de tipo varchar
o power de tipo integer (corresponde a máxima potencia de carga en W)

esto como codigo SQL en las lineas;
<code>
DROP TABLE IF EXISTS `charge_points`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charge_points` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `connections` int NOT NULL,
  `country` varchar(255) NOT NULL,
  `latitude` varchar(255) NOT NULL,
  `longitude` varchar(255) NOT NULL,
  `operator` varchar(255) NOT NULL,
  `power` int NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
</code>

# # Rutas
Existen varias rutas para la aplicación API, estas son las más importantes, se encuentran en;
<code>
    techTest\TechTest\TechTest\src\main\java\com\fabianpalma\techtest\rest
</code>
Entre las varias rutas que se solicitaron en este examen estan:

POST /chargePoints
    Permite crear punto de carga usando las mismas columnas que se muestran en la
    tabla creada (la información puede ser nueva, usando coordenadas en Chile y datos
    inventados, pero siguiendo la misma estructura que las vistas anteriormente en la
    WEB Open Charge Map):
        id, status, operator, connections, latitude, longitude, country, power

GET /chargePoints
    Permite obtener todos los puntos almacenados en BD.

GET /chargePoints/:id
    Permite obtener un punto en específico usando el ID.

GET /bestChargingOption?latitude=:lat&longitude=:lon
    Permite obtener la información de 2 puntos de carga: el más cercano y el de mayor
    potencia disponible.

    La respuesta esperada seria:
    {
        chargePointBestDistance: {...},
        chargePointBestPower: {...}
    }

# Ejecución

Luego de ejecutar la aplicación Springboot utilizamo <a href="https://web.postman.co/">POSTMAN</a> para ejecutar las ordenes del RESTAPI, las evidencias estan en la siguiente <a href="https://api.postman.com/collections/26808522-965a8c7a-364b-4e8c-a8d4-796e612ca5fe?access_key=PMAT-01HW6X4H6KVAFT68H1FMGJ72CZ">URL POSTMAN</a>
