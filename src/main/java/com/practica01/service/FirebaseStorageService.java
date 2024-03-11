package com.practica01.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "practica01arboles.appspot.com";

    final String rutaSuperiorStorage = "practica01arboles";

    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "practica01arboles-firebase-adminsdk-2u9lq-27477a209b.json";
}
