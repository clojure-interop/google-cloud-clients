(ns com.google.cloud.storage.Storage$BlobListOption
  "Class for specifying blob list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$BlobListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of blobs returned per page.

  page-size - `long`

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption [^Long page-size]
    (Storage$BlobListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing blobs.

  page-token - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption [^java.lang.String page-token]
    (Storage$BlobListOption/pageToken page-token)))

(defn *prefix
  "Returns an option to set a prefix to filter results to blobs whose names begin with this
   prefix.

  prefix - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption [^java.lang.String prefix]
    (Storage$BlobListOption/prefix prefix)))

(defn *current-directory
  "If specified, results are returned in a directory-like mode. Blobs whose names, after a
   possible prefix(String), do not contain the '/' delimiter are returned as is. Blobs
   whose names, after a possible prefix(String), contain the '/' delimiter, will have
   their name truncated after the delimiter and will be returned as Blob objects where
   only BlobInfo.getBlobId(), BlobInfo.getSize() and BlobInfo.isDirectory() are set.
   For such directory blobs, (BlobId.getGeneration() returns null), BlobInfo.getSize() returns 0 while BlobInfo.isDirectory() returns true.
   Duplicate directory blobs are omitted.

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption []
    (Storage$BlobListOption/currentDirectory )))

(defn *user-project
  "Returns an option to define the billing user project. This option is required by buckets with
   `requester_pays` flag enabled to assign operation costs.

  user-project - projectId of the billing user project. - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption [^java.lang.String user-project]
    (Storage$BlobListOption/userProject user-project)))

(defn *versions
  "If set to true, lists all versions of a blob. The default is false.

  versions - `boolean`

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption [^Boolean versions]
    (Storage$BlobListOption/versions versions)))

(defn *fields
  "Returns an option to specify the blob's fields to be returned by the RPC call. If this option
   is not provided all blob's fields are returned. BlobListOption.fields) can be used to
   specify only the fields of interest. Blob name and bucket are always returned, even if not
   specified.

  fields - `com.google.cloud.storage.Storage$BlobField`

  returns: `com.google.cloud.storage.Storage$BlobListOption`"
  (^com.google.cloud.storage.Storage$BlobListOption [^com.google.cloud.storage.Storage$BlobField fields]
    (Storage$BlobListOption/fields fields)))

