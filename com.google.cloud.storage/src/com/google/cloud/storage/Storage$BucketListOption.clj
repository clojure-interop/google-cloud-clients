(ns com.google.cloud.storage.Storage$BucketListOption
  "Class for specifying bucket list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BucketListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of buckets returned per page.

  page-size - `long`

  returns: `com.google.cloud.storage.Storage$BucketListOption`"
  (^com.google.cloud.storage.Storage$BucketListOption [^Long page-size]
    (Storage$BucketListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing buckets.

  page-token - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketListOption`"
  (^com.google.cloud.storage.Storage$BucketListOption [^java.lang.String page-token]
    (Storage$BucketListOption/pageToken page-token)))

(defn *prefix
  "Returns an option to set a prefix to filter results to buckets whose names begin with this
   prefix.

  prefix - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketListOption`"
  (^com.google.cloud.storage.Storage$BucketListOption [^java.lang.String prefix]
    (Storage$BucketListOption/prefix prefix)))

(defn *user-project
  "Returns an option for bucket's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BucketListOption`"
  (^com.google.cloud.storage.Storage$BucketListOption [^java.lang.String user-project]
    (Storage$BucketListOption/userProject user-project)))

(defn *fields
  "Returns an option to specify the bucket's fields to be returned by the RPC call. If this
   option is not provided all bucket's fields are returned. BucketListOption.fields) can
   be used to specify only the fields of interest. Bucket name is always returned, even if not
   specified.

  fields - `com.google.cloud.storage.Storage$BucketField`

  returns: `com.google.cloud.storage.Storage$BucketListOption`"
  (^com.google.cloud.storage.Storage$BucketListOption [^com.google.cloud.storage.Storage$BucketField fields]
    (Storage$BucketListOption/fields fields)))

