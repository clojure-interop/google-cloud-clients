(ns com.google.cloud.storage.Storage$BucketGetOption
  "Class for specifying bucket get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BucketGetOption]))

(defn *metageneration-match
  "Returns an option for bucket's metageneration match. If this option is used the request will
   fail if bucket's metageneration does not match the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BucketGetOption`"
  (^com.google.cloud.storage.Storage$BucketGetOption [^Long metageneration]
    (Storage$BucketGetOption/metagenerationMatch metageneration)))

(defn *metageneration-not-match
  "Returns an option for bucket's metageneration mismatch. If this option is used the request
   will fail if bucket's metageneration matches the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BucketGetOption`"
  (^com.google.cloud.storage.Storage$BucketGetOption [^Long metageneration]
    (Storage$BucketGetOption/metagenerationNotMatch metageneration)))

(defn *user-project
  "Returns an option for bucket's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketGetOption`"
  (^com.google.cloud.storage.Storage$BucketGetOption [^java.lang.String user-project]
    (Storage$BucketGetOption/userProject user-project)))

(defn *fields
  "Returns an option to specify the bucket's fields to be returned by the RPC call. If this
   option is not provided all bucket's fields are returned. BucketGetOption.fields) can
   be used to specify only the fields of interest. Bucket name is always returned, even if not
   specified.

  fields - `com.google.cloud.storage.Storage$BucketField`

  returns: `com.google.cloud.storage.Storage$BucketGetOption`"
  (^com.google.cloud.storage.Storage$BucketGetOption [^com.google.cloud.storage.Storage$BucketField fields]
    (Storage$BucketGetOption/fields fields)))

