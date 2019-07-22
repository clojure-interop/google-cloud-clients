(ns com.google.cloud.storage.Storage$BlobGetOption
  "Class for specifying blob get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BlobGetOption]))

(defn *generation-match
  "Returns an option for blob's data generation match. If this option is used the request will
   fail if blob's generation does not match the provided value.

  generation - `long`

  returns: `com.google.cloud.storage.Storage$BlobGetOption`"
  (^com.google.cloud.storage.Storage$BlobGetOption [^Long generation]
    (Storage$BlobGetOption/generationMatch generation))
  (^com.google.cloud.storage.Storage$BlobGetOption []
    (Storage$BlobGetOption/generationMatch )))

(defn *generation-not-match
  "Returns an option for blob's data generation mismatch. If this option is used the request
   will fail if blob's generation matches the provided value.

  generation - `long`

  returns: `com.google.cloud.storage.Storage$BlobGetOption`"
  (^com.google.cloud.storage.Storage$BlobGetOption [^Long generation]
    (Storage$BlobGetOption/generationNotMatch generation))
  (^com.google.cloud.storage.Storage$BlobGetOption []
    (Storage$BlobGetOption/generationNotMatch )))

(defn *metageneration-match
  "Returns an option for blob's metageneration match. If this option is used the request will
   fail if blob's metageneration does not match the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BlobGetOption`"
  (^com.google.cloud.storage.Storage$BlobGetOption [^Long metageneration]
    (Storage$BlobGetOption/metagenerationMatch metageneration)))

(defn *metageneration-not-match
  "Returns an option for blob's metageneration mismatch. If this option is used the request will
   fail if blob's metageneration matches the provided value.

  metageneration - `long`

  returns: `com.google.cloud.storage.Storage$BlobGetOption`"
  (^com.google.cloud.storage.Storage$BlobGetOption [^Long metageneration]
    (Storage$BlobGetOption/metagenerationNotMatch metageneration)))

(defn *fields
  "Returns an option to specify the blob's fields to be returned by the RPC call. If this option
   is not provided all blob's fields are returned. BlobGetOption.fields) can be used to
   specify only the fields of interest. Blob name and bucket are always returned, even if not
   specified.

  fields - `com.google.cloud.storage.Storage$BlobField`

  returns: `com.google.cloud.storage.Storage$BlobGetOption`"
  (^com.google.cloud.storage.Storage$BlobGetOption [^com.google.cloud.storage.Storage$BlobField fields]
    (Storage$BlobGetOption/fields fields)))

(defn *user-project
  "Returns an option for blob's billing user project. This option is only used by the buckets
   with 'requester_pays' flag.

  user-project - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobGetOption`"
  (^com.google.cloud.storage.Storage$BlobGetOption [^java.lang.String user-project]
    (Storage$BlobGetOption/userProject user-project)))

