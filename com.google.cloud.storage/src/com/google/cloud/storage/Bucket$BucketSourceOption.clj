(ns com.google.cloud.storage.Bucket$BucketSourceOption
  "Class for specifying bucket source options when Bucket methods are used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Bucket$BucketSourceOption]))

(defn *metageneration-match
  "Returns an option for bucket's metageneration match. If this option is used the request will
   fail if metageneration does not match.

  returns: `com.google.cloud.storage.Bucket$BucketSourceOption`"
  (^com.google.cloud.storage.Bucket$BucketSourceOption []
    (Bucket$BucketSourceOption/metagenerationMatch )))

(defn *metageneration-not-match
  "Returns an option for bucket's metageneration mismatch. If this option is used the request
   will fail if metageneration matches.

  returns: `com.google.cloud.storage.Bucket$BucketSourceOption`"
  (^com.google.cloud.storage.Bucket$BucketSourceOption []
    (Bucket$BucketSourceOption/metagenerationNotMatch )))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Bucket$BucketSourceOption`"
  (^com.google.cloud.storage.Bucket$BucketSourceOption [^java.lang.String user-project]
    (Bucket$BucketSourceOption/userProject user-project)))

