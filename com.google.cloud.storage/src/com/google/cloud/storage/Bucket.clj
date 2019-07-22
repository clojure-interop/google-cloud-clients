(ns com.google.cloud.storage.Bucket
  "A Google cloud storage bucket.

  Objects of this class are immutable. Operations that modify the bucket like update(com.google.cloud.storage.Storage.BucketTargetOption...)
  return a new object. To get a Bucket object with the most recent information use reload(com.google.cloud.storage.Bucket.BucketSourceOption...). Bucket adds a layer of service-related functionality over BucketInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Bucket]))

(defn update-acl
  "Updates an ACL entry on this bucket.

   Example of updating a new ACL entry.



   Acl acl = bucket.updateAcl(Acl.of(User.ofAllAuthenticatedUsers(), Acl.Role.OWNER));

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Bucket this ^com.google.cloud.storage.Acl acl]
    (-> this (.updateAcl acl))))

(defn update-default-acl
  "Updates a default blob ACL entry on this bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of updating a new default ACL entry.



   Acl acl = bucket.updateDefaultAcl(Acl.of(User.ofAllAuthenticatedUsers(), Acl.Role.OWNER));

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Bucket this ^com.google.cloud.storage.Acl acl]
    (-> this (.updateDefaultAcl acl))))

(defn list
  "Returns the paginated list of Blob in this bucket.

   Example of listing the blobs in the bucket.



   Page<Blob> blobs = bucket.list();
   Iterator<Blob> blobIterator = blobs.iterateAll();
   while (blobIterator.hasNext()) {
     Blob blob = blobIterator.next();
     // do something with the blob
   }

  options - options for listing blobs - `com.google.cloud.storage.Storage$BlobListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.storage.Blob>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.gax.paging.Page [^Bucket this ^com.google.cloud.storage.Storage$BlobListOption options]
    (-> this (.list options))))

(defn get-default-acl
  "Returns the default object ACL entry for the specified entity on this bucket or null if
   not found.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of getting the default ACL entry for an entity.



   Acl acl = bucket.getDefaultAcl(User.ofAllAuthenticatedUsers());

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Bucket this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.getDefaultAcl entity))))

(defn list-acls
  "Lists the ACL entries for this bucket.

   Example of listing the ACL entries.



   List<Acl> acls = bucket.listAcls();
   for (Acl acl : acls) {
     // do something with ACL entry
   }

  returns: `java.util.List<com.google.cloud.storage.Acl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Bucket this]
    (-> this (.listAcls))))

(defn delete
  "Deletes this bucket.

   Example of deleting the bucket, if its metageneration matches the BucketInfo.getMetageneration() value, otherwise a StorageException is thrown.



   boolean deleted = bucket.delete(BucketSourceOption.metagenerationMatch());
   if (deleted) {
     // the bucket was deleted
   } else {
     // the bucket was not found
   }

  options - bucket delete options - `com.google.cloud.storage.Bucket$BucketSourceOption`

  returns: true if bucket was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Bucket this ^com.google.cloud.storage.Bucket$BucketSourceOption options]
    (-> this (.delete options))))

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

  options - `com.google.cloud.storage.Storage$BucketTargetOption`

  returns: a Bucket object of the locked bucket - `com.google.cloud.storage.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Bucket [^Bucket this ^com.google.cloud.storage.Storage$BucketTargetOption options]
    (-> this (.lockRetentionPolicy options))))

(defn get-acl
  "Returns the ACL entry for the specified entity on this bucket or null if not found.

   Example of getting the ACL entry for an entity.



   Acl acl = bucket.getAcl(User.ofAllAuthenticatedUsers());

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Bucket this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.getAcl entity))))

(defn update
  "Updates the bucket's information. Bucket's name cannot be changed. A new Bucket object
   is returned. By default no checks are made on the metadata generation of the current bucket. If
   you want to update the information only if the current bucket metadata are at their latest
   version use the metagenerationMatch option: bucket.update(BucketTargetOption.metagenerationMatch())

   Example of updating the bucket's information.



   Bucket updatedBucket = bucket.toBuilder().setVersioningEnabled(true).build().update();

  options - update options - `com.google.cloud.storage.Storage$BucketTargetOption`

  returns: a Bucket object with updated information - `com.google.cloud.storage.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Bucket [^Bucket this ^com.google.cloud.storage.Storage$BucketTargetOption options]
    (-> this (.update options))))

(defn create-default-acl
  "Creates a new default blob ACL entry on this bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of creating a new default ACL entry.



   Acl acl = bucket.createDefaultAcl(Acl.of(User.ofAllAuthenticatedUsers(), Acl.Role.READER));

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Bucket this ^com.google.cloud.storage.Acl acl]
    (-> this (.createDefaultAcl acl))))

(defn get-storage
  "Returns the bucket's Storage object used to issue requests.

  returns: `com.google.cloud.storage.Storage`"
  (^com.google.cloud.storage.Storage [^Bucket this]
    (-> this (.getStorage))))

(defn delete-acl
  "Deletes the ACL entry for the specified entity on this bucket.

   Example of deleting the ACL entry for an entity.



   boolean deleted = bucket.deleteAcl(User.ofAllAuthenticatedUsers());
   if (deleted) {
     // the acl entry was deleted
   } else {
     // the acl entry was not found
   }

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Bucket this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.deleteAcl entity))))

(defn reload
  "Fetches current bucket's latest information. Returns null if the bucket does not exist.

   Example of getting the bucket's latest information, if its generation does not match the
   BucketInfo.getMetageneration() value, otherwise a StorageException is thrown.



   Bucket latestBucket = bucket.reload(BucketSourceOption.metagenerationMatch());
   if (latestBucket == null) {
     // the bucket was not found
   }

  options - bucket read options - `com.google.cloud.storage.Bucket$BucketSourceOption`

  returns: a Bucket object with latest information or null if not found - `com.google.cloud.storage.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Bucket [^Bucket this ^com.google.cloud.storage.Bucket$BucketSourceOption options]
    (-> this (.reload options))))

(defn delete-default-acl
  "Deletes the default object ACL entry for the specified entity on this bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of deleting the default ACL entry for an entity.



   boolean deleted = bucket.deleteDefaultAcl(User.ofAllAuthenticatedUsers());
   if (deleted) {
     // the acl entry was deleted
   } else {
     // the acl entry was not found
   }

  entity - `com.google.cloud.storage.Acl$Entity`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Bucket this ^com.google.cloud.storage.Acl$Entity entity]
    (-> this (.deleteDefaultAcl entity))))

(defn create
  "Creates a new blob in this bucket. Direct upload is used to upload content. For large
   content, Blob.writer(com.google.cloud.storage.Storage.BlobWriteOption...) is
   recommended as it uses resumable upload. MD5 and CRC32C hashes of content are computed
   and used for validating transferred data.

   Example of creating a blob in the bucket from a byte array with a content type.



   String blobName = \"my_blob_name\";
   Blob blob = bucket.create(blobName, \"Hello, World!\".getBytes(UTF_8), \"text/plain\");

  blob - a blob name - `java.lang.String`
  content - the blob content - `byte[]`
  content-type - the blob content type - `java.lang.String`
  options - options for blob creation - `com.google.cloud.storage.Bucket$BlobTargetOption`

  returns: a complete blob information - `com.google.cloud.storage.Blob`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Blob [^Bucket this ^java.lang.String blob content ^java.lang.String content-type ^com.google.cloud.storage.Bucket$BlobTargetOption options]
    (-> this (.create blob content content-type options)))
  (^com.google.cloud.storage.Blob [^Bucket this ^java.lang.String blob content ^com.google.cloud.storage.Bucket$BlobTargetOption options]
    (-> this (.create blob content options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Bucket this]
    (-> this (.hashCode))))

(defn exists?
  "Checks if this bucket exists.

   Example of checking if the bucket exists.



   boolean exists = bucket.exists();
   if (exists) {
     // the bucket exists
   } else {
     // the bucket was not found
   }

  options - `com.google.cloud.storage.Bucket$BucketSourceOption`

  returns: true if this bucket exists, false otherwise - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^Bucket this ^com.google.cloud.storage.Bucket$BucketSourceOption options]
    (-> this (.exists options))))

(defn list-default-acls
  "Lists the default blob ACL entries for this bucket.

   Default ACLs are applied to a new blob within the bucket when no ACL was provided for that
   blob.

   Example of listing the default ACL entries.



   List<Acl> acls = bucket.listDefaultAcls();
   for (Acl acl : acls) {
     // do something with ACL entry
   }

  returns: `java.util.List<com.google.cloud.storage.Acl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Bucket this]
    (-> this (.listDefaultAcls))))

(defn get
  "Returns a list of requested blobs in this bucket. Blobs that do not exist are null.

   Example of getting some blobs in the bucket, using a batch request.



   String blobName1 = \"my_blob_name1\";
   String blobName2 = \"my_blob_name2\";
   List<Blob> blobs = bucket.get(blobName1, blobName2);
   for (Blob blob : blobs) {
     if (blob == null) {
       // the blob was not found
     }
   }

  blob-name-1 - first blob to get - `java.lang.String`
  blob-name-2 - second blob to get - `java.lang.String`
  blob-names - other blobs to get - `java.lang.String`

  returns: an immutable list of Blob objects - `java.util.List<com.google.cloud.storage.Blob>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^Bucket this ^java.lang.String blob-name-1 ^java.lang.String blob-name-2 ^java.lang.String blob-names]
    (-> this (.get blob-name-1 blob-name-2 blob-names)))
  (^com.google.cloud.storage.Blob [^Bucket this ^java.lang.String blob ^com.google.cloud.storage.Storage$BlobGetOption options]
    (-> this (.get blob options)))
  (^java.util.List [^Bucket this ^java.lang.Iterable blob-names]
    (-> this (.get blob-names))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Bucket this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn create-acl
  "Creates a new ACL entry on this bucket.

   Example of creating a new ACL entry.



   Acl acl = bucket.createAcl(Acl.of(User.ofAllAuthenticatedUsers(), Acl.Role.READER));

  acl - `com.google.cloud.storage.Acl`

  returns: `com.google.cloud.storage.Acl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.Acl [^Bucket this ^com.google.cloud.storage.Acl acl]
    (-> this (.createAcl acl))))

(defn to-builder
  "Description copied from class: BucketInfo

  returns: `com.google.cloud.storage.Bucket$Builder`"
  (^com.google.cloud.storage.Bucket$Builder [^Bucket this]
    (-> this (.toBuilder))))

