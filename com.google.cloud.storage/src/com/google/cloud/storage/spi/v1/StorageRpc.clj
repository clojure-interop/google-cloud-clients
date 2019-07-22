(ns com.google.cloud.storage.spi.v1.StorageRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi.v1 StorageRpc]))

(defn list
  "Lists the bucket's blobs.

  bucket - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.storage.model.StorageObject>>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.Tuple [^StorageRpc this ^java.lang.String bucket ^java.util.Map options]
    (-> this (.list bucket options)))
  (^com.google.cloud.Tuple [^StorageRpc this ^java.util.Map options]
    (-> this (.list options))))

(defn get-default-acl
  "Returns the default object ACL entry for the specified entity on the specified bucket or null if not found.

  bucket - `java.lang.String`
  entity - `java.lang.String`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.ObjectAccessControl [^StorageRpc this ^java.lang.String bucket ^java.lang.String entity]
    (-> this (.getDefaultAcl bucket entity))))

(defn set-iam-policy
  "Updates the IAM policy for the specified bucket.

  bucket - `java.lang.String`
  policy - `com.google.api.services.storage.model.Policy`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Policy`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.Policy [^StorageRpc this ^java.lang.String bucket ^com.google.api.services.storage.model.Policy policy ^java.util.Map options]
    (-> this (.setIamPolicy bucket policy options))))

(defn patch-acl
  "Updates an ACL entry on the specified bucket.

  acl - `com.google.api.services.storage.model.BucketAccessControl`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.BucketAccessControl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.BucketAccessControl [^StorageRpc this ^com.google.api.services.storage.model.BucketAccessControl acl ^java.util.Map options]
    (-> this (.patchAcl acl options)))
  (^com.google.api.services.storage.model.ObjectAccessControl [^StorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.patchAcl acl))))

(defn list-acls
  "Lists the ACL entries for the provided object.

  bucket - `java.lang.String`
  object - `java.lang.String`
  generation - `java.lang.Long`

  returns: `java.util.List<com.google.api.services.storage.model.ObjectAccessControl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^StorageRpc this ^java.lang.String bucket ^java.lang.String object ^java.lang.Long generation]
    (-> this (.listAcls bucket object generation)))
  (^java.util.List [^StorageRpc this ^java.lang.String bucket ^java.util.Map options]
    (-> this (.listAcls bucket options))))

(defn continue-rewrite
  "Continues rewriting on an already open rewrite channel.

  previous-response - `com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse`

  returns: `com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse [^StorageRpc this ^com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse previous-response]
    (-> this (.continueRewrite previous-response))))

(defn create-notification
  "Creates a notification with the specified entity on the specified bucket.

  bucket - `java.lang.String`
  notification - `com.google.api.services.storage.model.Notification`

  returns: the notification that was created. - `com.google.api.services.storage.model.Notification`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.Notification [^StorageRpc this ^java.lang.String bucket ^com.google.api.services.storage.model.Notification notification]
    (-> this (.createNotification bucket notification))))

(defn delete
  "Deletes the requested bucket.

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: true if the bucket was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^StorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.delete bucket options))))

(defn load
  "Reads all the bytes from a storage object.

  storage-object - `com.google.api.services.storage.model.StorageObject`
  options - `java.util.Map`

  returns: `byte[]`

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^StorageRpc this ^com.google.api.services.storage.model.StorageObject storage-object ^java.util.Map options]
    (-> this (.load storage-object options))))

(defn lock-retention-policy
  "Lock retention policy for the provided bucket.

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: a Bucket object of the locked bucket - `com.google.api.services.storage.model.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.Bucket [^StorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.lockRetentionPolicy bucket options))))

(defn get-service-account
  "Returns the service account associated with the given project.

  project-id - `java.lang.String`

  returns: the ID of the project to fetch the service account for. - `com.google.api.services.storage.model.ServiceAccount`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.ServiceAccount [^StorageRpc this ^java.lang.String project-id]
    (-> this (.getServiceAccount project-id))))

(defn read
  "Reads the given amount of bytes from a storage object at the given position.

  from - `com.google.api.services.storage.model.StorageObject`
  options - `java.util.Map`
  position - `long`
  bytes - `int`

  returns: `com.google.cloud.Tuple<java.lang.String,byte[]>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^StorageRpc this ^com.google.api.services.storage.model.StorageObject from ^java.util.Map options ^Long position ^Integer bytes]
    (-> this (.read from options position bytes))))

(defn get-acl
  "Returns the ACL entry for the specified entity on the specified object or null if not
   found.

  bucket - `java.lang.String`
  object - `java.lang.String`
  generation - `java.lang.Long`
  entity - `java.lang.String`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.ObjectAccessControl [^StorageRpc this ^java.lang.String bucket ^java.lang.String object ^java.lang.Long generation ^java.lang.String entity]
    (-> this (.getAcl bucket object generation entity)))
  (^com.google.api.services.storage.model.BucketAccessControl [^StorageRpc this ^java.lang.String bucket ^java.lang.String entity ^java.util.Map options]
    (-> this (.getAcl bucket entity options))))

(defn patch-default-acl
  "Updates a default object ACL entry on the specified bucket.

  acl - `com.google.api.services.storage.model.ObjectAccessControl`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.ObjectAccessControl [^StorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.patchDefaultAcl acl))))

(defn open-rewrite
  "Sends a rewrite request to open a rewrite channel.

  rewrite-request - `com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest`

  returns: `com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse [^StorageRpc this ^com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest rewrite-request]
    (-> this (.openRewrite rewrite-request))))

(defn create-default-acl
  "Creates a new default object ACL entry on the specified bucket.

  acl - `com.google.api.services.storage.model.ObjectAccessControl`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.ObjectAccessControl [^StorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.createDefaultAcl acl))))

(defn delete-acl
  "Deletes the ACL entry for the specified entity on the specified object.

  bucket - `java.lang.String`
  object - `java.lang.String`
  generation - `java.lang.Long`
  entity - `java.lang.String`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^StorageRpc this ^java.lang.String bucket ^java.lang.String object ^java.lang.Long generation ^java.lang.String entity]
    (-> this (.deleteAcl bucket object generation entity)))
  (^Boolean [^StorageRpc this ^java.lang.String bucket ^java.lang.String entity ^java.util.Map options]
    (-> this (.deleteAcl bucket entity options))))

(defn patch
  "Updates bucket information.

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.Bucket [^StorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.patch bucket options))))

(defn compose
  "Sends a compose request.

  sources - `java.lang.Iterable`
  target - `com.google.api.services.storage.model.StorageObject`
  target-options - `java.util.Map`

  returns: `com.google.api.services.storage.model.StorageObject`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.StorageObject [^StorageRpc this ^java.lang.Iterable sources ^com.google.api.services.storage.model.StorageObject target ^java.util.Map target-options]
    (-> this (.compose sources target target-options))))

(defn create-batch
  "Creates an empty batch.

  returns: `com.google.cloud.storage.spi.v1.RpcBatch`"
  (^com.google.cloud.storage.spi.v1.RpcBatch [^StorageRpc this]
    (-> this (.createBatch))))

(defn get-iam-policy
  "Returns the IAM policy for the specified bucket.

  bucket - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Policy`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.Policy [^StorageRpc this ^java.lang.String bucket ^java.util.Map options]
    (-> this (.getIamPolicy bucket options))))

(defn delete-default-acl
  "Deletes the default object ACL entry for the specified entity on the specified bucket.

  bucket - `java.lang.String`
  entity - `java.lang.String`

  returns: true if the ACL was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^StorageRpc this ^java.lang.String bucket ^java.lang.String entity]
    (-> this (.deleteDefaultAcl bucket entity))))

(defn delete-notification
  "Deletes the notification with the specified name on the specified object.

  bucket - `java.lang.String`
  notification - `java.lang.String`

  returns: true if the notification was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^Boolean [^StorageRpc this ^java.lang.String bucket ^java.lang.String notification]
    (-> this (.deleteNotification bucket notification))))

(defn create
  "Creates a new storage object.

  object - `com.google.api.services.storage.model.StorageObject`
  content - `java.io.InputStream`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.StorageObject`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.StorageObject [^StorageRpc this ^com.google.api.services.storage.model.StorageObject object ^java.io.InputStream content ^java.util.Map options]
    (-> this (.create object content options)))
  (^com.google.api.services.storage.model.Bucket [^StorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.create bucket options))))

(defn open
  "Opens a resumable upload channel for a given storage object.

  object - `com.google.api.services.storage.model.StorageObject`
  options - `java.util.Map`

  returns: `java.lang.String`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.lang.String [^StorageRpc this ^com.google.api.services.storage.model.StorageObject object ^java.util.Map options]
    (-> this (.open object options)))
  (^java.lang.String [^StorageRpc this ^java.lang.String signed-url]
    (-> this (.open signed-url))))

(defn write
  "Writes the provided bytes to a storage object at the provided location.

  upload-id - `java.lang.String`
  to-write - `byte[]`
  to-write-offset - `int`
  dest-offset - `long`
  length - `int`
  last - `boolean`

  throws: com.google.cloud.storage.StorageException - upon failure"
  ([^StorageRpc this ^java.lang.String upload-id to-write ^Integer to-write-offset ^Long dest-offset ^Integer length ^Boolean last]
    (-> this (.write upload-id to-write to-write-offset dest-offset length last))))

(defn list-default-acls
  "Lists the default object ACL entries for the provided bucket.

  bucket - `java.lang.String`

  returns: `java.util.List<com.google.api.services.storage.model.ObjectAccessControl>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^StorageRpc this ^java.lang.String bucket]
    (-> this (.listDefaultAcls bucket))))

(defn get
  "Returns the requested bucket or null if not found.

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Bucket`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.Bucket [^StorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.get bucket options))))

(defn create-acl
  "Creates a new ACL entry on the specified bucket.

  acl - `com.google.api.services.storage.model.BucketAccessControl`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.BucketAccessControl`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.BucketAccessControl [^StorageRpc this ^com.google.api.services.storage.model.BucketAccessControl acl ^java.util.Map options]
    (-> this (.createAcl acl options)))
  (^com.google.api.services.storage.model.ObjectAccessControl [^StorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.createAcl acl))))

(defn test-iam-permissions
  "Tests whether the caller holds the specified permissions for the specified bucket.

  bucket - `java.lang.String`
  permissions - `java.util.List`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.TestIamPermissionsResponse`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^com.google.api.services.storage.model.TestIamPermissionsResponse [^StorageRpc this ^java.lang.String bucket ^java.util.List permissions ^java.util.Map options]
    (-> this (.testIamPermissions bucket permissions options))))

(defn list-notifications
  "List the notifications for the provided bucket.

  bucket - `java.lang.String`

  returns: a list of Notification objects that exist on the bucket. - `java.util.List<com.google.api.services.storage.model.Notification>`

  throws: com.google.cloud.storage.StorageException - upon failure"
  (^java.util.List [^StorageRpc this ^java.lang.String bucket]
    (-> this (.listNotifications bucket))))

