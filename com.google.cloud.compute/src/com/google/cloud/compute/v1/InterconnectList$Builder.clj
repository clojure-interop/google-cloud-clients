(ns com.google.cloud.compute.v1.InterconnectList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InterconnectList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#interconnectList for lists of interconnects.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectList$Builder this]
    (-> this (.getKind))))

(defn add-all-items
  "A list of Interconnect resources.

  items - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^java.util.List items]
    (-> this (.addAllItems items))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#interconnectList for lists of interconnects.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectList`"
  (^com.google.cloud.compute.v1.InterconnectList [^InterconnectList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectList`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^com.google.cloud.compute.v1.InterconnectList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn get-items-list
  "A list of Interconnect resources.

  returns: `java.util.List<com.google.cloud.compute.v1.Interconnect>`"
  (^java.util.List [^InterconnectList$Builder this]
    (-> this (.getItemsList))))

(defn add-items
  "A list of Interconnect resources.

  items - `com.google.cloud.compute.v1.Interconnect`

  returns: `com.google.cloud.compute.v1.InterconnectList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectList$Builder [^InterconnectList$Builder this ^com.google.cloud.compute.v1.Interconnect items]
    (-> this (.addItems items))))

