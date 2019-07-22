(ns com.google.cloud.storage.Storage$BucketSourceOption
  "Class for specifying bucket source options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BucketSourceOption]))

(defn *metageneration-match
  "Returns an option for bucket's metageneration match. If this option is used the request will
   fail if bucket's metageneration does not match the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BucketSourceOption`"
  (^com.google.cloud.storage.Storage$BucketSourceOption [^Long metageneration]
    (Storage$BucketSourceOption/metagenerationMatch metageneration)))

(defn *metageneration-not-match
  "Returns an option for bucket's metageneration mismatch. If this option is used the request
   will fail if bucket's metageneration matches the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BucketSourceOption`"
  (^com.google.cloud.storage.Storage$BucketSourceOption [^Long metageneration]
    (Storage$BucketSourceOption/metagenerationNotMatch metageneration)))

(defn *user-project
  "Returns an option for bucket's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketSourceOption`"
  (^com.google.cloud.storage.Storage$BucketSourceOption [^java.lang.String user-project]
    (Storage$BucketSourceOption/userProject user-project)))

