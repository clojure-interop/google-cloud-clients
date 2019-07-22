(ns com.google.cloud.storage.Blob
  "A Google cloud storage object.

  Objects of this class are immutable. Operations that modify the blob like update(com.google.cloud.storage.Storage.BlobTargetOption...) and
  copyTo(com.google.cloud.storage.BlobId, com.google.cloud.storage.Blob.BlobSourceOption...) return a new object. To get a Blob object with the most recent
  information use reload(com.google.cloud.storage.Blob.BlobSourceOption...). Blob adds a layer of service-related functionality over
  BlobInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Blob]))

(defn update-acl
  "Updates an ACL entry on this blob.

   Example of updating a new ACL entry.



   Acl acl = blob.updateAcl(Acl.of(User.ofAllAuthenticatedUsers(), Acl.Role.OWNER));

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Blob this ^com.google.cloud.storage.Acl acl]
    (-> this (.updateAcl acl))))

(defn list-acls
  "Lists the ACL entries for this blob.

   Example of listing the ACL entries.



   List<Acl> acls = blob.listAcls();
   for (Acl acl : acls) {
     // do something with ACL entry
   }

  returns: `java.util.List<com.google.cloud.storage.Acl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Blob this]
    (-> this (.listAcls))))

(defn reader
  "Returns a ReadChannel object for reading this blob's content.

   Example of reading the blob's content through a reader.



   try (ReadChannel reader = blob.reader()) {
     ByteBuffer bytes = ByteBuffer.allocate(64 * 1024);
     while (reader.read(bytes) > 0) {
       bytes.flip();
       // do something with bytes
       bytes.clear();
     }
   }

   Example of reading just a portion of the blob's content.



   int start = 1;
   int end = 8;
   try (ReadChannel reader = blob.reader()) {
     reader.seek(start);
     ByteBuffer bytes = ByteBuffer.allocate(end - start);
     reader.read(bytes);
     return bytes.array();
   }

  options - blob read options - `com.google.cloud.storage.Blob$BlobSourceOption`

  returns: `com.google.cloud.ReadChannel`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.ReadChannel [^Blob this ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.reader options))))

(defn delete
  "Deletes this blob.

   Example of deleting the blob, if its generation matches the BlobInfo.getGeneration()
   value, otherwise a StorageException is thrown.



   boolean deleted = blob.delete(BlobSourceOption.generationMatch());
   if (deleted) {
     // the blob was deleted
   } else {
     // the blob was not found
   }

  options - blob delete options - `com.google.cloud.storage.Blob$BlobSourceOption`

  returns: true if blob was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Blob this ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.delete options))))

(defn sign-url
  "Generates a signed URL for this blob. If you want to allow access for a fixed amount of time to
   this blob, you can use this method to generate a URL that is only valid within a certain time
   period. This is particularly useful if you don't want publicly accessible blobs, but also don't
   want to require users to explicitly log in. Signing a URL requires a service account signer. If
   an instance of ServiceAccountSigner was passed to StorageOptions' builder via setCredentials(Credentials) or the default credentials are
   being used and the environment variable GOOGLE_APPLICATION_CREDENTIALS is set or your
   application is running in App Engine, then signUrl will use that credentials to sign
   the URL. If the credentials passed to StorageOptions do not implement ServiceAccountSigner (this is the case, for instance, for Compute Engine credentials and
   Google Cloud SDK credentials) then signUrl will throw an IllegalStateException
   unless an implementation of ServiceAccountSigner is passed using the Storage.SignUrlOption.signWith(ServiceAccountSigner) option.

   A service account signer is looked for in the following order:


     The signer passed with the option Storage.SignUrlOption.signWith(ServiceAccountSigner)
     The credentials passed to StorageOptions
     The default credentials, if no credentials were passed to StorageOptions


   Example of creating a signed URL for the blob that is valid for 2 weeks, using the default
   credentials for signing the URL.



   URL signedUrl = blob.signUrl(14, TimeUnit.DAYS);

   Example of creating a signed URL for the blob passing the Storage.SignUrlOption.signWith(ServiceAccountSigner) option, that will be used to sign the URL.



   String keyPath = \"/path/to/key.json\";
   URL signedUrl = blob.signUrl(14, TimeUnit.DAYS, SignUrlOption.signWith(
       ServiceAccountCredentials.fromStream(new FileInputStream(keyPath))));

  duration - time until the signed URL expires, expressed in unit. The finer granularity supported is 1 second, finer granularities will be truncated - `long`
  unit - time unit of the duration parameter - `java.util.concurrent.TimeUnit`
  options - optional URL signing options - `com.google.cloud.storage.Storage$SignUrlOption`

  returns: a signed URL for this blob and the specified options - `java.net.URL`

  throws: java.lang.IllegalStateException - if Storage.SignUrlOption.signWith(ServiceAccountSigner) was not used and no implementation of ServiceAccountSigner was provided to StorageOptions"
  (^java.net.URL [^Blob this ^Long duration ^java.util.concurrent.TimeUnit unit ^com.google.cloud.storage.Storage$SignUrlOption options]
    (-> this (.signUrl duration unit options))))

(defn get-acl
  "Returns the ACL entry for the specified entity on this blob or null if not found.

   Example of getting the ACL entry for an entity.



   Acl acl = blob.getAcl(User.ofAllAuthenticatedUsers());

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Blob this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.getAcl entity))))

(defn update
  "Updates the blob's information. Bucket or blob's name cannot be changed by this method. If you
   want to rename the blob or move it to a different bucket use the copyTo(com.google.cloud.storage.BlobId, com.google.cloud.storage.Blob.BlobSourceOption...) and delete(com.google.cloud.storage.Blob.BlobSourceOption...) operations. A new Blob object is returned. By default no checks are made on
   the metadata generation of the current blob. If you want to update the information only if the
   current blob metadata are at their latest version use the metagenerationMatch option:
   newBlob.update(BlobTargetOption.metagenerationMatch()).

   Original metadata are merged with metadata in the provided blobInfo. If the original
   metadata already contains a key specified in the provided blobInfo's metadata map, it
   will be replaced by the new value. Removing metadata can be done by setting that metadata's
   value to null.

   Example of adding new metadata values or updating existing ones.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   Map<String, String> newMetadata = new HashMap<>();
   newMetadata.put(\"keyToAddOrUpdate\", \"value\");
   Blob blob = storage.update(BlobInfo.newBuilder(bucketName, blobName)
       .setMetadata(newMetadata)
       .build());

   Example of removing metadata values.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   Map<String, String> newMetadata = new HashMap<>();
   newMetadata.put(\"keyToRemove\", null);
   Blob blob = storage.update(BlobInfo.newBuilder(bucketName, blobName)
       .setMetadata(newMetadata)
       .build());

  options - update options - `com.google.cloud.storage.Storage$BlobTargetOption`

  returns: a Blob object with updated information - `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^Blob this ^com.google.cloud.storage.Storage$BlobTargetOption options]
    (-> this (.update options))))

(defn get-storage
  "Returns the blob's Storage object used to issue requests.

  returns: `com.google.cloud.storage.Storage`"
  (^com.google.cloud.storage.Storage [^Blob this]
    (-> this (.getStorage))))

(defn delete-acl
  "Deletes the ACL entry for the specified entity on this blob.

   Example of deleting the ACL entry for an entity.



   boolean deleted = blob.deleteAcl(User.ofAllAuthenticatedUsers());
   if (deleted) {
     // the acl entry was deleted
   } else {
     // the acl entry was not found
   }

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Blob this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.deleteAcl entity))))

(defn download-to
  "Downloads this blob to the given file path using specified blob read options.

  path - destination - `java.nio.file.Path`
  options - blob read options - `com.google.cloud.storage.Blob$BlobSourceOption`

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^Blob this ^java.nio.file.Path path ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.downloadTo path options)))
  ([^Blob this ^java.nio.file.Path path]
    (-> this (.downloadTo path))))

(defn writer
  "Returns a WriteChannel object for writing to this blob. By default any md5 and crc32c
   values in the current blob are ignored unless requested via the BlobWriteOption.md5Match and BlobWriteOption.crc32cMatch options.

   Example of writing the blob's content through a writer.



   byte[] content = \"Hello, World!\".getBytes(UTF_8);
   try (WriteChannel writer = blob.writer()) {
     try {
       writer.write(ByteBuffer.wrap(content, 0, content.length));
     } catch (Exception ex) {
       // handle exception
     }
   }

  options - target blob options - `com.google.cloud.storage.Storage$BlobWriteOption`

  returns: `com.google.cloud.WriteChannel`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.WriteChannel [^Blob this ^com.google.cloud.storage.Storage$BlobWriteOption options]
    (-> this (.writer options))))

(defn reload
  "Fetches current blob's latest information. Returns null if the blob does not exist.

   Example of getting the blob's latest information, if its generation does not match the
   BlobInfo.getGeneration() value, otherwise a StorageException is thrown.



   Blob latestBlob = blob.reload(BlobSourceOption.generationNotMatch());
   if (latestBlob == null) {
     // the blob was not found
   }

  options - blob read options - `com.google.cloud.storage.Blob$BlobSourceOption`

  returns: a Blob object with latest information or null if not found - `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^Blob this ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.reload options))))

(defn copy-to
  "Sends a copy request for the current blob to the target blob. Possibly also some of the
   metadata are copied (e.g. content-type).

   Example of copying the blob to a different bucket with a different name.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"copy_blob_name\";
   CopyWriter copyWriter = blob.copyTo(bucketName, blobName);
   Blob copiedBlob = copyWriter.getResult();

   Example of moving a blob to a different bucket with a different name.



   String destBucket = \"my_unique_bucket\";
   String destBlob = \"move_blob_name\";
   CopyWriter copyWriter = blob.copyTo(destBucket, destBlob);
   Blob copiedBlob = copyWriter.getResult();
   boolean deleted = blob.delete();

  target-bucket - target bucket's name - `java.lang.String`
  target-blob - target blob's name - `java.lang.String`
  options - source blob options - `com.google.cloud.storage.Blob$BlobSourceOption`

  returns: a CopyWriter object that can be used to get information on the newly created
       blob or to complete the copy if more than one RPC request is needed - `com.google.cloud.storage.CopyWriter`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.CopyWriter [^Blob this ^java.lang.String target-bucket ^java.lang.String target-blob ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.copyTo target-bucket target-blob options)))
  (^com.google.cloud.storage.CopyWriter [^Blob this ^com.google.cloud.storage.BlobId target-blob ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.copyTo target-blob options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Blob this]
    (-> this (.hashCode))))

(defn exists?
  "Checks if this blob exists.

   Example of checking if the blob exists.



   boolean exists = blob.exists();
   if (exists) {
     // the blob exists
   } else {
     // the blob was not found
   }

  options - blob read options - `com.google.cloud.storage.Blob$BlobSourceOption`

  returns: true if this blob exists, false otherwise - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Blob this ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.exists options))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Blob this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn create-acl
  "Creates a new ACL entry on this blob.

   Example of creating a new ACL entry.



   Acl acl = blob.createAcl(Acl.of(User.ofAllAuthenticatedUsers(), Acl.Role.READER));

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Blob this ^com.google.cloud.storage.Acl acl]
    (-> this (.createAcl acl))))

(defn to-builder
  "Description copied from class: BlobInfo

  returns: `com.google.cloud.storage.Blob$Builder`"
  (^com.google.cloud.storage.Blob$Builder [^Blob this]
    (-> this (.toBuilder))))

(defn get-content
  "Returns this blob's content.

   Example of reading all bytes of the blob, if its generation matches the BlobInfo.getGeneration() value, otherwise a StorageException is thrown.



   byte[] content = blob.getContent(BlobSourceOption.generationMatch());

  options - blob read options - `com.google.cloud.storage.Blob$BlobSourceOption`

  returns: `byte[]`

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^Blob this ^com.google.cloud.storage.Blob$BlobSourceOption options]
    (-> this (.getContent options))))

