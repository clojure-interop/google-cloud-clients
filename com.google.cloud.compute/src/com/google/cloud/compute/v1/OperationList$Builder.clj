(ns com.google.cloud.compute.v1.OperationList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 OperationList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^OperationList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#operations for Operations resource.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList$Builder this]
    (-> this (.getKind))))

(defn add-all-items
  "[Output Only] A list of Operation resources.

  items - `java.util.List`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^java.util.List items]
    (-> this (.addAllItems items))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#operations for Operations resource.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.OperationList`"
  (^com.google.cloud.compute.v1.OperationList [^OperationList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.OperationList`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^com.google.cloud.compute.v1.OperationList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn get-items-list
  "[Output Only] A list of Operation resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Operation>`"
  (^java.util.List [^OperationList$Builder this]
    (-> this (.getItemsList))))

(defn add-items
  "[Output Only] A list of Operation resources.

  items - `com.google.cloud.compute.v1.Operation`

  returns: `com.google.cloud.compute.v1.OperationList$Builder`"
  (^com.google.cloud.compute.v1.OperationList$Builder [^OperationList$Builder this ^com.google.cloud.compute.v1.Operation items]
    (-> this (.addItems items))))

