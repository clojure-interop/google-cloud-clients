(ns com.google.cloud.storage.Storage
  "An interface for Google Cloud Storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage]))

(defn update-acl
  "Updates an ACL entry on the specified bucket.

   Example of updating a new ACL entry on a bucket.



   String bucketName = \"my_unique_bucket\";
   Acl acl = storage.updateAcl(bucketName, Acl.of(User.ofAllAuthenticatedUsers(), Role.OWNER));

   Example of updating a new ACL entry on a requester_pays bucket with a user_project option.



   String bucketName = \"my_unique_bucket\";
   Acl acl = storage.updateAcl(bucketName, Acl.of(User.ofAllAuthenticatedUsers(), Role.OWNER),
       BucketSourceOption.userProject(\"myProject\"));

  bucket - name of the bucket where the updateAcl operation takes place - `java.lang.String`
  acl - ACL to update - `com.google.cloud.storage.Acl`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl acl ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.updateAcl bucket acl options)))
  (^com.google.cloud.storage.Acl [^Storage this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Acl acl]
    (-> this (.updateAcl blob acl))))

(defn update-default-acl
  "Updates a default blob ACL entry on the specified bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of updating a new default ACL entry on a bucket.



   String bucketName = \"my_unique_bucket\";
   Acl acl =
       storage.updateDefaultAcl(bucketName, Acl.of(User.ofAllAuthenticatedUsers(), Role.OWNER));

  bucket - `java.lang.String`
  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl acl]
    (-> this (.updateDefaultAcl bucket acl))))

(defn list
  "Lists the bucket's blobs. If the Storage.BlobListOption.currentDirectory() option is provided,
   results are returned in a directory-like mode.

   Example of listing blobs in a provided directory.



   String bucketName = \"my_unique_bucket\";
   String directory = \"my_directory/\";
   Page<Blob> blobs = storage.list(bucketName, BlobListOption.currentDirectory(),
       BlobListOption.prefix(directory));
   Iterator<Blob> blobIterator = blobs.iterateAll();
   while (blobIterator.hasNext()) {
     Blob blob = blobIterator.next();
     // do something with the blob
   }

  bucket - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.storage.Blob>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.gax.paging.Page [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Storage$BlobListOption options]
    (-> this (.list bucket options)))
  (^com.google.api.gax.paging.Page [^Storage this ^com.google.cloud.storage.Storage$BucketListOption options]
    (-> this (.list options))))

(defn get-default-acl
  "Returns the default object ACL entry for the specified entity on the specified bucket or null if not found.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of getting the default ACL entry for an entity on a bucket.



   String bucketName = \"my_unique_bucket\";
   Acl acl = storage.getDefaultAcl(bucketName, User.ofAllAuthenticatedUsers());

  bucket - `java.lang.String`
  entity - `com.google.cloud.storage.Acl$Entity`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.getDefaultAcl bucket entity))))

(defn set-iam-policy
  "Updates the IAM policy on the specified bucket.

   Example of updating the IAM policy on a bucket.



   // We want to make all objects in our bucket publicly readable.
   String bucketName = \"my_unique_bucket\";
   Policy currentPolicy = storage.getIamPolicy(bucketName);
   Policy updatedPolicy =
       storage.setIamPolicy(
           bucketName,
           currentPolicy.toBuilder()
               .addIdentity(StorageRoles.objectViewer(), Identity.allUsers())
               .build());

  bucket - name of the bucket where the setIamPolicy operation takes place - `java.lang.String`
  policy - policy to be set on the specified bucket - `com.google.cloud.Policy`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `com.google.cloud.Policy`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.Policy [^Storage this ^java.lang.String bucket ^com.google.cloud.Policy policy ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.setIamPolicy bucket policy options))))

(defn list-acls
  "Lists the ACL entries for the provided bucket.

   Example of listing the ACL entries for a blob.



   String bucketName = \"my_unique_bucket\";
   List<Acl> acls = storage.listAcls(bucketName);
   for (Acl acl : acls) {
     // do something with ACL entry
   }

   Example of listing the ACL entries for a blob in a requester_pays bucket with a user_project
   option.



   String bucketName = \"my_unique_bucket\";
   List<Acl> acls = storage.listAcls(bucketName, BucketSourceOption.userProject(\"myProject\"));
   for (Acl acl : acls) {
     // do something with ACL entry
   }

  bucket - the name of the bucket to list ACLs for - `java.lang.String`
  options - any number of BucketSourceOptions to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `java.util.List<com.google.cloud.storage.Acl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.listAcls bucket options)))
  (^java.util.List [^Storage this ^com.google.cloud.storage.BlobId blob]
    (-> this (.listAcls blob))))

(defn copy
  "Sends a copy request. This method copies both blob's data and information. To override source
   blob's information supply a BlobInfo to the CopyRequest using either Storage.CopyRequest.Builder.setTarget(BlobInfo, Storage.BlobTargetOption...) or Storage.CopyRequest.Builder.setTarget(BlobInfo, Iterable).

   This method returns a CopyWriter object for the provided CopyRequest. If
   source and destination objects share the same location and storage class the source blob is
   copied with one request and CopyWriter.getResult() immediately returns, regardless of
   the Storage.CopyRequest.megabytesCopiedPerChunk parameter. If source and destination have
   different location or storage class CopyWriter.getResult() might issue multiple RPC
   calls depending on blob's size.

   Example of copying a blob.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   String copyBlobName = \"copy_blob_name\";
   CopyRequest request = CopyRequest.newBuilder()
       .setSource(BlobId.of(bucketName, blobName))
       .setTarget(BlobId.of(bucketName, copyBlobName))
       .build();
   Blob blob = storage.copy(request).getResult();

   Example of copying a blob in chunks.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   String copyBlobName = \"copy_blob_name\";
   CopyRequest request = CopyRequest.newBuilder()
       .setSource(BlobId.of(bucketName, blobName))
       .setTarget(BlobId.of(bucketName, copyBlobName))
       .build();
   CopyWriter copyWriter = storage.copy(request);
   while (!copyWriter.isDone()) {
     copyWriter.copyChunk();
   }
   Blob blob = copyWriter.getResult();

   Example of rotating the encryption key of a blob.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   String oldEncryptionKey = \"old_encryption_key\";
   String newEncryptionKey = \"new_encryption_key\";
   BlobId blobId = BlobId.of(bucketName, blobName);
   CopyRequest request = CopyRequest.newBuilder()
       .setSource(blobId)
       .setSourceOptions(BlobSourceOption.decryptionKey(oldEncryptionKey))
       .setTarget(blobId, BlobTargetOption.encryptionKey(newEncryptionKey))
       .build();
   Blob blob = storage.copy(request).getResult();

  copy-request - `com.google.cloud.storage.Storage$CopyRequest`

  returns: a CopyWriter object that can be used to get information on the newly created
       blob or to complete the copy if more than one RPC request is needed - `com.google.cloud.storage.CopyWriter`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.CopyWriter [^Storage this ^com.google.cloud.storage.Storage$CopyRequest copy-request]
    (-> this (.copy copy-request))))

(defn reader
  "Returns a channel for reading the blob's content. The blob's latest generation is read. If the
   blob changes while reading (i.e. BlobInfo.getEtag() changes), subsequent calls to
   blobReadChannel.read(ByteBuffer) may throw StorageException.

   Example of reading a blob's content through a reader.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   try (ReadChannel reader = storage.reader(bucketName, blobName)) {
     ByteBuffer bytes = ByteBuffer.allocate(64 * 1024);
     while (reader.read(bytes) > 0) {
       bytes.flip();
       // do something with bytes
       bytes.clear();
     }
   }

  bucket - `java.lang.String`
  blob - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobSourceOption`

  returns: `com.google.cloud.ReadChannel`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.ReadChannel [^Storage this ^java.lang.String bucket ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.reader bucket blob options)))
  (^com.google.cloud.ReadChannel [^Storage this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.reader blob options))))

(defn delete
  "Deletes the requested blob.

   Example of deleting a blob, only if its generation matches a value, otherwise a StorageException is thrown.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   long blobGeneration = 42;
   boolean deleted = storage.delete(bucketName, blobName,
       BlobSourceOption.generationMatch(blobGeneration));
   if (deleted) {
     // the blob was deleted
   } else {
     // the blob was not found
   }

  bucket - `java.lang.String`
  blob - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobSourceOption`

  returns: true if blob was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Storage this ^java.lang.String bucket ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.delete bucket blob options)))
  (^Boolean [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.delete bucket options)))
  (^Boolean [^Storage this ^com.google.cloud.storage.BlobId blob]
    (-> this (.delete blob))))

(defn sign-url
  "Generates a signed URL for a blob. If you have a blob that you want to allow access to for a
   fixed amount of time, you can use this method to generate a URL that is only valid within a
   certain time period. This is particularly useful if you don't want publicly accessible blobs,
   but also don't want to require users to explicitly log in. Signing a URL requires a service
   account signer. If an instance of ServiceAccountSigner was passed to
   StorageOptions' builder via setCredentials(Credentials) or the default
   credentials are being used and the environment variable GOOGLE_APPLICATION_CREDENTIALS
   is set or your application is running in App Engine, then signUrl will use that
   credentials to sign the URL. If the credentials passed to StorageOptions do not
   implement ServiceAccountSigner (this is the case, for instance, for Google Cloud SDK
   credentials) then signUrl will throw an IllegalStateException unless an
   implementation of ServiceAccountSigner is passed using the Storage.SignUrlOption.signWith(ServiceAccountSigner) option.

   A service account signer is looked for in the following order:


     The signer passed with the option Storage.SignUrlOption.signWith(ServiceAccountSigner)
     The credentials passed to StorageOptions
     The default credentials, if no credentials were passed to StorageOptions


   Example of creating a signed URL that is valid for 2 weeks, using the default credentials
   for signing the URL.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   URL signedUrl = storage.signUrl(BlobInfo.newBuilder(bucketName, blobName).build(), 14,
       TimeUnit.DAYS);

   Example of creating a signed URL passing the Storage.SignUrlOption.withV4Signature() option,
   which enables V4 signing.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   URL signedUrl = storage.signUrl(BlobInfo.newBuilder(bucketName, blobName).build(),
       7, TimeUnit.DAYS, Storage.SignUrlOption.withV4Signature());

   Example of creating a signed URL passing the Storage.SignUrlOption.signWith(ServiceAccountSigner) option, that will be used for signing the URL.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   String keyPath = \"/path/to/key.json\";
   URL signedUrl = storage.signUrl(BlobInfo.newBuilder(bucketName, blobName).build(),
       14, TimeUnit.DAYS, SignUrlOption.signWith(
           ServiceAccountCredentials.fromStream(new FileInputStream(keyPath))));

   Note that the ServiceAccountSigner may require additional configuration to enable
   URL signing. See the documentation for the implementation for more details.

  blob-info - the blob associated with the signed URL - `com.google.cloud.storage.BlobInfo`
  duration - time until the signed URL expires, expressed in unit. The finest granularity supported is 1 second, finer granularities will be truncated - `long`
  unit - time unit of the duration parameter - `java.util.concurrent.TimeUnit`
  options - optional URL signing options SignUrlOption.withHostName() option to set a custom host name instead of using https://storage.googleapis.com. - `com.google.cloud.storage.Storage$SignUrlOption`

  returns: `java.net.URL`

  throws: java.lang.IllegalStateException - if Storage.SignUrlOption.signWith(ServiceAccountSigner) was not used and no implementation of ServiceAccountSigner was provided to StorageOptions"
  (^java.net.URL [^Storage this ^com.google.cloud.storage.BlobInfo blob-info ^Long duration ^java.util.concurrent.TimeUnit unit ^com.google.cloud.storage.Storage$SignUrlOption options]
    (-> this (.signUrl blob-info duration unit options))))

(defn lock-retention-policy
  "Locks bucket retention policy. Requires a local metageneration value in the request. Review
   example below.

   Accepts an optional userProject Storage.BucketTargetOption option which defines the project
   id to assign operational costs.

   Warning: Once a retention policy is locked, it can't be unlocked, removed, or shortened.

   Example of locking a retention policy on a bucket, only if its local metageneration value
   matches the bucket's service metageneration otherwise a StorageException is thrown.



   String bucketName = \"my_unique_bucket\";
   Bucket bucket = storage.get(bucketName, BucketGetOption.fields(BucketField.METAGENERATION));
   storage.lockRetentionPolicy(bucket, BucketTargetOption.metagenerationMatch());

  bucket - `com.google.cloud.storage.BucketInfo`
  options - `com.google.cloud.storage.Storage$BucketTargetOption`

  returns: a Bucket object of the locked bucket - `com.google.cloud.storage.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Bucket [^Storage this ^com.google.cloud.storage.BucketInfo bucket ^com.google.cloud.storage.Storage$BucketTargetOption options]
    (-> this (.lockRetentionPolicy bucket options))))

(defn get-service-account
  "Returns the service account associated with the given project.

   Example of getting a service account.



   String projectId = \"test@gmail.com\";
   ServiceAccount account = storage.getServiceAccount(projectId);

  project-id - the ID of the project for which the service account should be fetched. - `java.lang.String`

  returns: the service account associated with this project - `com.google.cloud.storage.ServiceAccount`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.ServiceAccount [^Storage this ^java.lang.String project-id]
    (-> this (.getServiceAccount project-id))))

(defn batch
  "Creates a new empty batch for grouping multiple service calls in one underlying RPC call.

   Example of using a batch request to delete, update and get a blob.



   String bucketName = \"my_unique_bucket\";
   String blobName1 = \"my_blob_name1\";
   String blobName2 = \"my_blob_name2\";
   StorageBatch batch = storage.batch();
   BlobId firstBlob = BlobId.of(bucketName, blobName1);
   BlobId secondBlob = BlobId.of(bucketName, blobName2);
   batch.delete(firstBlob).notify(new BatchResult.Callback<Boolean, StorageException>() {
     public void success(Boolean result) {
       // deleted successfully
     }

     public void error(StorageException exception) {
       // delete failed
     }
   });
   batch.update(BlobInfo.newBuilder(secondBlob).setContentType(\"text/plain\").build());
   StorageBatchResult<Blob> result = batch.get(secondBlob);
   batch.submit();
   Blob blob = result.get(); // returns get result or throws StorageException

  returns: `com.google.cloud.storage.StorageBatch`"
  (^com.google.cloud.storage.StorageBatch [^Storage this]
    (-> this (.batch))))

(defn get-acl
  "Returns the ACL entry for the specified entity on the specified bucket or null if not
   found.

   Example of getting the ACL entry for an entity on a bucket.



   String bucketName = \"my_unique_bucket\";
   Acl acl = storage.getAcl(bucketName, User.ofAllAuthenticatedUsers());

   Example of getting the ACL entry for a specific user on a requester_pays bucket with a
   user_project option.



   String bucketName = \"my_unique_bucket\";
   String userEmail = \"google-cloud-java-tests@java-docs-samples-tests.iam.gserviceaccount.com\";
   BucketSourceOption userProjectOption = BucketSourceOption.userProject(\"myProject\");
   Acl acl = storage.getAcl(bucketName, new User(userEmail), userProjectOption);

  bucket - name of the bucket where the getAcl operation takes place - `java.lang.String`
  entity - ACL entity to fetch - `com.google.cloud.storage.Acl$Entity`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl$Entity entity ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.getAcl bucket entity options)))
  (^com.google.cloud.storage.Acl [^Storage this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.getAcl blob entity))))

(defn update
  "Updates bucket information.

   Accepts an optional userProject Storage.BucketTargetOption option which defines the project
   id to assign operational costs.

   Example of updating bucket information.



   String bucketName = \"my_unique_bucket\";
   BucketInfo bucketInfo = BucketInfo.newBuilder(bucketName).setVersioningEnabled(true).build();
   Bucket bucket = storage.update(bucketInfo);

  bucket-info - `com.google.cloud.storage.BucketInfo`
  options - `com.google.cloud.storage.Storage$BucketTargetOption`

  returns: the updated bucket - `com.google.cloud.storage.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Bucket [^Storage this ^com.google.cloud.storage.BucketInfo bucket-info ^com.google.cloud.storage.Storage$BucketTargetOption options]
    (-> this (.update bucket-info options)))
  (^com.google.cloud.storage.Blob [^Storage this ^com.google.cloud.storage.BlobInfo blob-info]
    (-> this (.update blob-info))))

(defn create-default-acl
  "Creates a new default blob ACL entry on the specified bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of creating a new default ACL entry on a bucket.



   String bucketName = \"my_unique_bucket\";
   Acl acl =
       storage.createDefaultAcl(bucketName, Acl.of(User.ofAllAuthenticatedUsers(), Role.READER));

  bucket - `java.lang.String`
  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl acl]
    (-> this (.createDefaultAcl bucket acl))))

(defn delete-acl
  "Deletes the ACL entry for the specified entity on the specified bucket.

   Example of deleting the ACL entry for an entity on a bucket.



   String bucketName = \"my_unique_bucket\";
   boolean deleted = storage.deleteAcl(bucketName, User.ofAllAuthenticatedUsers());
   if (deleted) {
     // the acl entry was deleted
   } else {
     // the acl entry was not found
   }

   Example of deleting the ACL entry for a specific user on a requester_pays bucket with a
   user_project option.



   String bucketName = \"my_unique_bucket\";
   BucketSourceOption userProject = BucketSourceOption.userProject(\"myProject\");
   boolean deleted = storage.deleteAcl(bucketName, User.ofAllAuthenticatedUsers(), userProject);

  bucket - name of the bucket to delete an ACL from - `java.lang.String`
  entity - ACL entity to delete - `com.google.cloud.storage.Acl$Entity`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl$Entity entity ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.deleteAcl bucket entity options)))
  (^Boolean [^Storage this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.deleteAcl blob entity))))

(defn read-all-bytes
  "Reads all the bytes from a blob.

   Example of reading all bytes of a blob, if generation matches a value, otherwise a StorageException is thrown.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   long blobGeneration = 42\";
   byte[] content = storage.readAllBytes(bucketName, blobName,
       BlobSourceOption.generationMatch(blobGeneration));

  bucket - `java.lang.String`
  blob - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobSourceOption`

  returns: the blob's content - `byte[]`

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^Storage this ^java.lang.String bucket ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.readAllBytes bucket blob options)))
  ([^Storage this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Storage$BlobSourceOption options]
    (-> this (.readAllBytes blob options))))

(defn writer
  "Creates a blob and return a channel for writing its content. By default any md5 and crc32c
   values in the given blobInfo are ignored unless requested via the BlobWriteOption.md5Match and BlobWriteOption.crc32cMatch options.

   Example of writing a blob's content through a writer.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   BlobId blobId = BlobId.of(bucketName, blobName);
   byte[] content = \"Hello, World!\".getBytes(UTF_8);
   BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType(\"text/plain\").build();
   try (WriteChannel writer = storage.writer(blobInfo)) {
     try {
       writer.write(ByteBuffer.wrap(content, 0, content.length));
     } catch (Exception ex) {
       // handle exception
     }
   }

  blob-info - `com.google.cloud.storage.BlobInfo`
  options - `com.google.cloud.storage.Storage$BlobWriteOption`

  returns: `com.google.cloud.WriteChannel`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.WriteChannel [^Storage this ^com.google.cloud.storage.BlobInfo blob-info ^com.google.cloud.storage.Storage$BlobWriteOption options]
    (-> this (.writer blob-info options)))
  (^com.google.cloud.WriteChannel [^Storage this ^java.net.URL signed-url]
    (-> this (.writer signed-url))))

(defn compose
  "Sends a compose request.

   Accepts an optional userProject Storage.BlobTargetOption option which defines the project id
   to assign operational costs.

   Example of composing two blobs.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   String sourceBlob1 = \"source_blob_1\";
   String sourceBlob2 = \"source_blob_2\";
   BlobId blobId = BlobId.of(bucketName, blobName);
   BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType(\"text/plain\").build();
   ComposeRequest request = ComposeRequest.newBuilder()
       .setTarget(blobInfo)
       .addSource(sourceBlob1)
       .addSource(sourceBlob2)
       .build();
   Blob blob = storage.compose(request);

  compose-request - `com.google.cloud.storage.Storage$ComposeRequest`

  returns: the composed blob - `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^Storage this ^com.google.cloud.storage.Storage$ComposeRequest compose-request]
    (-> this (.compose compose-request))))

(defn get-iam-policy
  "Gets the IAM policy for the provided bucket.

   Example of getting the IAM policy for a bucket.



   String bucketName = \"my_unique_bucket\";
   Policy policy = storage.getIamPolicy(bucketName);

  bucket - name of the bucket where the getIamPolicy operation takes place - `java.lang.String`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `com.google.cloud.Policy`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.Policy [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.getIamPolicy bucket options))))

(defn delete-default-acl
  "Deletes the default object ACL entry for the specified entity on the specified bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of deleting the default ACL entry for an entity on a bucket.



   String bucketName = \"my_unique_bucket\";
   boolean deleted = storage.deleteDefaultAcl(bucketName, User.ofAllAuthenticatedUsers());
   if (deleted) {
     // the acl entry was deleted
   } else {
     // the acl entry was not found
   }

  bucket - `java.lang.String`
  entity - `com.google.cloud.storage.Acl$Entity`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.deleteDefaultAcl bucket entity))))

(defn create
  "Creates a new blob with the sub array of the given byte array. Direct upload is used to upload
   content. For large content, writer(com.google.cloud.storage.BlobInfo, com.google.cloud.storage.Storage.BlobWriteOption...) is recommended as it uses resumable upload.
   MD5 and CRC32C hashes of content are computed and used for validating transferred data.
   Accepts a userProject Storage.BlobGetOption option, which defines the project id to assign
   operational costs.

   Example of creating a blob from a byte array.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   BlobId blobId = BlobId.of(bucketName, blobName);
   BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType(\"text/plain\").build();
   Blob blob = storage.create(blobInfo, \"Hello, World!\".getBytes(UTF_8), 7, 5);

  blob-info - `com.google.cloud.storage.BlobInfo`
  content - `byte[]`
  offset - `int`
  length - `int`
  options - `com.google.cloud.storage.Storage$BlobTargetOption`

  returns: a [@code Blob} with complete information - `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^Storage this ^com.google.cloud.storage.BlobInfo blob-info content ^Integer offset ^Integer length ^com.google.cloud.storage.Storage$BlobTargetOption options]
    (-> this (.create blob-info content offset length options)))
  (^com.google.cloud.storage.Blob [^Storage this ^com.google.cloud.storage.BlobInfo blob-info content ^com.google.cloud.storage.Storage$BlobTargetOption options]
    (-> this (.create blob-info content options)))
  (^com.google.cloud.storage.Bucket [^Storage this ^com.google.cloud.storage.BucketInfo bucket-info ^com.google.cloud.storage.Storage$BucketTargetOption options]
    (-> this (.create bucket-info options))))

(defn list-default-acls
  "Lists the default blob ACL entries for the provided bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of listing the default ACL entries for a blob.



   String bucketName = \"my_unique_bucket\";
   List<Acl> acls = storage.listDefaultAcls(bucketName);
   for (Acl acl : acls) {
     // do something with ACL entry
   }

  bucket - `java.lang.String`

  returns: `java.util.List<com.google.cloud.storage.Acl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Storage this ^java.lang.String bucket]
    (-> this (.listDefaultAcls bucket))))

(defn get
  "Returns the requested blob or null if not found.

   Accepts an optional userProject Storage.BlobGetOption option which defines the project id to
   assign operational costs.

   Example of getting information on a blob, only if its metageneration matches a value,
   otherwise a StorageException is thrown.



   String bucketName = \"my_unique_bucket\";
   String blobName = \"my_blob_name\";
   long blobMetageneration = 42;
   Blob blob = storage.get(bucketName, blobName,
       BlobGetOption.metagenerationMatch(blobMetageneration));

  bucket - `java.lang.String`
  blob - `java.lang.String`
  options - `com.google.cloud.storage.Storage$BlobGetOption`

  returns: `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^Storage this ^java.lang.String bucket ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobGetOption options]
    (-> this (.get bucket blob options)))
  (^com.google.cloud.storage.Bucket [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Storage$BucketGetOption options]
    (-> this (.get bucket options)))
  (^com.google.cloud.storage.Blob [^Storage this ^com.google.cloud.storage.BlobId blob]
    (-> this (.get blob))))

(defn create-acl
  "Creates a new ACL entry on the specified bucket.

   Example of creating a new ACL entry on a bucket.



   String bucketName = \"my_unique_bucket\";
   Acl acl = storage.createAcl(bucketName, Acl.of(User.ofAllAuthenticatedUsers(), Role.READER));

   Example of creating a new ACL entry on a requester_pays bucket with a user_project option.



   String bucketName = \"my_unique_bucket\";
   Acl acl = storage.createAcl(bucketName, Acl.of(User.ofAllAuthenticatedUsers(), Role.READER),
       BucketSourceOption.userProject(\"myProject\"));

  bucket - name of the bucket for which an ACL should be created - `java.lang.String`
  acl - ACL to create - `com.google.cloud.storage.Acl`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Storage this ^java.lang.String bucket ^com.google.cloud.storage.Acl acl ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.createAcl bucket acl options)))
  (^com.google.cloud.storage.Acl [^Storage this ^com.google.cloud.storage.BlobId blob ^com.google.cloud.storage.Acl acl]
    (-> this (.createAcl blob acl))))

(defn test-iam-permissions
  "Tests whether the caller holds the permissions on the specified bucket. Returns a list of
   booleans in the same placement and order in which the permissions were specified.

   Example of testing permissions on a bucket.



   String bucketName = \"my_unique_bucket\";
   List<Boolean> response =
       storage.testIamPermissions(
           bucket,
           ImmutableList.of(\"storage.buckets.get\", \"storage.buckets.getIamPolicy\"));
   for (boolean hasPermission : response) {
     // Do something with permission test response
   }

  bucket - name of the bucket where the testIamPermissions operation takes place - `java.lang.String`
  permissions - list of permissions to test on the bucket - `java.util.List`
  options - extra parameters to apply to this operation - `com.google.cloud.storage.Storage$BucketSourceOption`

  returns: `java.util.List<java.lang.Boolean>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Storage this ^java.lang.String bucket ^java.util.List permissions ^com.google.cloud.storage.Storage$BucketSourceOption options]
    (-> this (.testIamPermissions bucket permissions options))))

