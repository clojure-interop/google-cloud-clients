(ns com.google.cloud.storage.Storage$BucketTargetOption
  "Class for specifying bucket target options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BucketTargetOption]))

(defn *predefined-acl
  "Returns an option for specifying bucket's predefined ACL configuration.

  acl - `com.google.cloud.storage.Storage$PredefinedAcl`

  returns: `com.google.cloud.storage.Storage$BucketTargetOption`"
  (^com.google.cloud.storage.Storage$BucketTargetOption [^com.google.cloud.storage.Storage$PredefinedAcl acl]
    (Storage$BucketTargetOption/predefinedAcl acl)))

(defn *predefined-default-object-acl
  "Returns an option for specifying bucket's default ACL configuration for blobs.

  acl - `com.google.cloud.storage.Storage$PredefinedAcl`

  returns: `com.google.cloud.storage.Storage$BucketTargetOption`"
  (^com.google.cloud.storage.Storage$BucketTargetOption [^com.google.cloud.storage.Storage$PredefinedAcl acl]
    (Storage$BucketTargetOption/predefinedDefaultObjectAcl acl)))

(defn *metageneration-match
  "Returns an option for bucket's metageneration match. If this option is used the request will
   fail if metageneration does not match.

  returns: `com.google.cloud.storage.Storage$BucketTargetOption`"
  (^com.google.cloud.storage.Storage$BucketTargetOption []
    (Storage$BucketTargetOption/metagenerationMatch )))

(defn *metageneration-not-match
  "Returns an option for bucket's metageneration mismatch. If this option is used the request
   will fail if metageneration matches.

  returns: `com.google.cloud.storage.Storage$BucketTargetOption`"
  (^com.google.cloud.storage.Storage$BucketTargetOption []
    (Storage$BucketTargetOption/metagenerationNotMatch )))

(defn *user-project
  "Returns an option to define the billing user project. This option is required by buckets with
   `requester_pays` flag enabled to assign operation costs.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketTargetOption`"
  (^com.google.cloud.storage.Storage$BucketTargetOption [^java.lang.String user-project]
    (Storage$BucketTargetOption/userProject user-project)))

(defn *projection
  "Returns an option to define the projection in the API request. In some cases this option may
   be needed to be set to `noAcl` to omit ACL data from the response. The default value is
   `full`

  projection - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketTargetOption`"
  (^com.google.cloud.storage.Storage$BucketTargetOption [^java.lang.String projection]
    (Storage$BucketTargetOption/projection projection)))

