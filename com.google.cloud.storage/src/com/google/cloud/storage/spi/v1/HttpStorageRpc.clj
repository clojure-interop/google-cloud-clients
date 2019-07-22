(ns com.google.cloud.storage.spi.v1.HttpStorageRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi.v1 HttpStorageRpc]))

(defn ->http-storage-rpc
  "Constructor.

  options - `com.google.cloud.storage.StorageOptions`"
  (^HttpStorageRpc [^com.google.cloud.storage.StorageOptions options]
    (new HttpStorageRpc options)))

(def *-default-projection
  "Static Constant.

  type: java.lang.String"
  HttpStorageRpc/DEFAULT_PROJECTION)

(def *-no-acl-projection
  "Static Constant.

  type: java.lang.String"
  HttpStorageRpc/NO_ACL_PROJECTION)

(defn list
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.storage.model.StorageObject>>`"
  (^com.google.cloud.Tuple [^HttpStorageRpc this ^java.lang.String bucket ^java.util.Map options]
    (-> this (.list bucket options)))
  (^com.google.cloud.Tuple [^HttpStorageRpc this ^java.util.Map options]
    (-> this (.list options))))

(defn get-default-acl
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  entity - `java.lang.String`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`"
  (^com.google.api.services.storage.model.ObjectAccessControl [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String entity]
    (-> this (.getDefaultAcl bucket entity))))

(defn set-iam-policy
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  policy - `com.google.api.services.storage.model.Policy`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Policy`"
  (^com.google.api.services.storage.model.Policy [^HttpStorageRpc this ^java.lang.String bucket ^com.google.api.services.storage.model.Policy policy ^java.util.Map options]
    (-> this (.setIamPolicy bucket policy options))))

(defn patch-acl
  "Description copied from interface: StorageRpc

  acl - `com.google.api.services.storage.model.BucketAccessControl`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.BucketAccessControl`"
  (^com.google.api.services.storage.model.BucketAccessControl [^HttpStorageRpc this ^com.google.api.services.storage.model.BucketAccessControl acl ^java.util.Map options]
    (-> this (.patchAcl acl options)))
  (^com.google.api.services.storage.model.ObjectAccessControl [^HttpStorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.patchAcl acl))))

(defn list-acls
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  object - `java.lang.String`
  generation - `java.lang.Long`

  returns: `java.util.List<com.google.api.services.storage.model.ObjectAccessControl>`"
  (^java.util.List [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String object ^java.lang.Long generation]
    (-> this (.listAcls bucket object generation)))
  (^java.util.List [^HttpStorageRpc this ^java.lang.String bucket ^java.util.Map options]
    (-> this (.listAcls bucket options))))

(defn continue-rewrite
  "Description copied from interface: StorageRpc

  previous-response - `com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse`

  returns: `com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse`"
  (^com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse [^HttpStorageRpc this ^com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse previous-response]
    (-> this (.continueRewrite previous-response))))

(defn create-notification
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  notification - `com.google.api.services.storage.model.Notification`

  returns: the notification that was created. - `com.google.api.services.storage.model.Notification`"
  (^com.google.api.services.storage.model.Notification [^HttpStorageRpc this ^java.lang.String bucket ^com.google.api.services.storage.model.Notification notification]
    (-> this (.createNotification bucket notification))))

(defn delete
  "Description copied from interface: StorageRpc

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: true if the bucket was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpStorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.delete bucket options))))

(defn load
  "Description copied from interface: StorageRpc

  from - `com.google.api.services.storage.model.StorageObject`
  options - `java.util.Map`

  returns: `byte[]`"
  ([^HttpStorageRpc this ^com.google.api.services.storage.model.StorageObject from ^java.util.Map options]
    (-> this (.load from options))))

(defn lock-retention-policy
  "Description copied from interface: StorageRpc

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: a Bucket object of the locked bucket - `com.google.api.services.storage.model.Bucket`"
  (^com.google.api.services.storage.model.Bucket [^HttpStorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.lockRetentionPolicy bucket options))))

(defn get-service-account
  "Description copied from interface: StorageRpc

  project-id - `java.lang.String`

  returns: the ID of the project to fetch the service account for. - `com.google.api.services.storage.model.ServiceAccount`"
  (^com.google.api.services.storage.model.ServiceAccount [^HttpStorageRpc this ^java.lang.String project-id]
    (-> this (.getServiceAccount project-id))))

(defn read
  "Description copied from interface: StorageRpc

  from - `com.google.api.services.storage.model.StorageObject`
  options - `java.util.Map`
  position - `long`
  output-stream - `java.io.OutputStream`

  returns: number of bytes downloaded, returns 0 if position higher than length. - `long`"
  (^Long [^HttpStorageRpc this ^com.google.api.services.storage.model.StorageObject from ^java.util.Map options ^Long position ^java.io.OutputStream output-stream]
    (-> this (.read from options position output-stream))))

(defn get-acl
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  object - `java.lang.String`
  generation - `java.lang.Long`
  entity - `java.lang.String`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`"
  (^com.google.api.services.storage.model.ObjectAccessControl [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String object ^java.lang.Long generation ^java.lang.String entity]
    (-> this (.getAcl bucket object generation entity)))
  (^com.google.api.services.storage.model.BucketAccessControl [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String entity ^java.util.Map options]
    (-> this (.getAcl bucket entity options))))

(defn patch-default-acl
  "Description copied from interface: StorageRpc

  acl - `com.google.api.services.storage.model.ObjectAccessControl`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`"
  (^com.google.api.services.storage.model.ObjectAccessControl [^HttpStorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.patchDefaultAcl acl))))

(defn open-rewrite
  "Description copied from interface: StorageRpc

  rewrite-request - `com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest`

  returns: `com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse`"
  (^com.google.cloud.storage.spi.v1.StorageRpc$RewriteResponse [^HttpStorageRpc this ^com.google.cloud.storage.spi.v1.StorageRpc$RewriteRequest rewrite-request]
    (-> this (.openRewrite rewrite-request))))

(defn create-default-acl
  "Description copied from interface: StorageRpc

  acl - `com.google.api.services.storage.model.ObjectAccessControl`

  returns: `com.google.api.services.storage.model.ObjectAccessControl`"
  (^com.google.api.services.storage.model.ObjectAccessControl [^HttpStorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.createDefaultAcl acl))))

(defn delete-acl
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  object - `java.lang.String`
  generation - `java.lang.Long`
  entity - `java.lang.String`

  returns: true if the ACL was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String object ^java.lang.Long generation ^java.lang.String entity]
    (-> this (.deleteAcl bucket object generation entity)))
  (^Boolean [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String entity ^java.util.Map options]
    (-> this (.deleteAcl bucket entity options))))

(defn patch
  "Description copied from interface: StorageRpc

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Bucket`"
  (^com.google.api.services.storage.model.Bucket [^HttpStorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.patch bucket options))))

(defn compose
  "Description copied from interface: StorageRpc

  sources - `java.lang.Iterable`
  target - `com.google.api.services.storage.model.StorageObject`
  target-options - `java.util.Map`

  returns: `com.google.api.services.storage.model.StorageObject`"
  (^com.google.api.services.storage.model.StorageObject [^HttpStorageRpc this ^java.lang.Iterable sources ^com.google.api.services.storage.model.StorageObject target ^java.util.Map target-options]
    (-> this (.compose sources target target-options))))

(defn create-batch
  "Description copied from interface: StorageRpc

  returns: `com.google.cloud.storage.spi.v1.RpcBatch`"
  (^com.google.cloud.storage.spi.v1.RpcBatch [^HttpStorageRpc this]
    (-> this (.createBatch))))

(defn get-iam-policy
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Policy`"
  (^com.google.api.services.storage.model.Policy [^HttpStorageRpc this ^java.lang.String bucket ^java.util.Map options]
    (-> this (.getIamPolicy bucket options))))

(defn delete-default-acl
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  entity - `java.lang.String`

  returns: true if the ACL was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String entity]
    (-> this (.deleteDefaultAcl bucket entity))))

(defn delete-notification
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  notification - `java.lang.String`

  returns: true if the notification was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpStorageRpc this ^java.lang.String bucket ^java.lang.String notification]
    (-> this (.deleteNotification bucket notification))))

(defn create
  "Description copied from interface: StorageRpc

  storage-object - `com.google.api.services.storage.model.StorageObject`
  content - `java.io.InputStream`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.StorageObject`"
  (^com.google.api.services.storage.model.StorageObject [^HttpStorageRpc this ^com.google.api.services.storage.model.StorageObject storage-object ^java.io.InputStream content ^java.util.Map options]
    (-> this (.create storage-object content options)))
  (^com.google.api.services.storage.model.Bucket [^HttpStorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.create bucket options))))

(defn open
  "Description copied from interface: StorageRpc

  object - `com.google.api.services.storage.model.StorageObject`
  options - `java.util.Map`

  returns: `java.lang.String`"
  (^java.lang.String [^HttpStorageRpc this ^com.google.api.services.storage.model.StorageObject object ^java.util.Map options]
    (-> this (.open object options)))
  (^java.lang.String [^HttpStorageRpc this ^java.lang.String signed-url]
    (-> this (.open signed-url))))

(defn write
  "Description copied from interface: StorageRpc

  upload-id - `java.lang.String`
  to-write - `byte[]`
  to-write-offset - `int`
  dest-offset - `long`
  length - `int`
  last - `boolean`"
  ([^HttpStorageRpc this ^java.lang.String upload-id to-write ^Integer to-write-offset ^Long dest-offset ^Integer length ^Boolean last]
    (-> this (.write upload-id to-write to-write-offset dest-offset length last))))

(defn list-default-acls
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`

  returns: `java.util.List<com.google.api.services.storage.model.ObjectAccessControl>`"
  (^java.util.List [^HttpStorageRpc this ^java.lang.String bucket]
    (-> this (.listDefaultAcls bucket))))

(defn get
  "Description copied from interface: StorageRpc

  bucket - `com.google.api.services.storage.model.Bucket`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.Bucket`"
  (^com.google.api.services.storage.model.Bucket [^HttpStorageRpc this ^com.google.api.services.storage.model.Bucket bucket ^java.util.Map options]
    (-> this (.get bucket options))))

(defn create-acl
  "Description copied from interface: StorageRpc

  acl - `com.google.api.services.storage.model.BucketAccessControl`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.BucketAccessControl`"
  (^com.google.api.services.storage.model.BucketAccessControl [^HttpStorageRpc this ^com.google.api.services.storage.model.BucketAccessControl acl ^java.util.Map options]
    (-> this (.createAcl acl options)))
  (^com.google.api.services.storage.model.ObjectAccessControl [^HttpStorageRpc this ^com.google.api.services.storage.model.ObjectAccessControl acl]
    (-> this (.createAcl acl))))

(defn test-iam-permissions
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`
  permissions - `java.util.List`
  options - `java.util.Map`

  returns: `com.google.api.services.storage.model.TestIamPermissionsResponse`"
  (^com.google.api.services.storage.model.TestIamPermissionsResponse [^HttpStorageRpc this ^java.lang.String bucket ^java.util.List permissions ^java.util.Map options]
    (-> this (.testIamPermissions bucket permissions options))))

(defn list-notifications
  "Description copied from interface: StorageRpc

  bucket - `java.lang.String`

  returns: a list of Notification objects that exist on the bucket. - `java.util.List<com.google.api.services.storage.model.Notification>`"
  (^java.util.List [^HttpStorageRpc this ^java.lang.String bucket]
    (-> this (.listNotifications bucket))))

