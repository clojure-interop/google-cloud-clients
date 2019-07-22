(ns com.google.cloud.compute.v1.BackendBucketList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucketList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^BackendBucketList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketList$Builder this]
    (-> this (.getKind))))

(defn add-all-items
  "A list of BackendBucket resources.

  items - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^java.util.List items]
    (-> this (.addAllItems items))))

(defn set-kind
  "Type of resource.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendBucketList`"
  (^com.google.cloud.compute.v1.BackendBucketList [^BackendBucketList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendBucketList`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^com.google.cloud.compute.v1.BackendBucketList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn get-items-list
  "A list of BackendBucket resources.

  returns: `java.util.List<com.google.cloud.compute.v1.BackendBucket>`"
  (^java.util.List [^BackendBucketList$Builder this]
    (-> this (.getItemsList))))

(defn add-items
  "A list of BackendBucket resources.

  items - `com.google.cloud.compute.v1.BackendBucket`

  returns: `com.google.cloud.compute.v1.BackendBucketList$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketList$Builder [^BackendBucketList$Builder this ^com.google.cloud.compute.v1.BackendBucket items]
    (-> this (.addItems items))))

