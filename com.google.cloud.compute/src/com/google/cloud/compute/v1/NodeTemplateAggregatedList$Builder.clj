(ns com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplateAggregatedList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeTemplateAggregatedList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource.Always compute#nodeTemplateAggregatedList for aggregated lists
   of node templates.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateAggregatedList$Builder this]
    (-> this (.getKind))))

(defn set-kind
  "[Output Only] Type of resource.Always compute#nodeTemplateAggregatedList for aggregated lists
   of node templates.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateAggregatedList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-items-map
  "A list of NodeTemplatesScopedList resources. The key for the map is: [Output Only] Name of
   the scope containing this set of node templates.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.NodeTemplatesScopedList>`"
  (^java.util.Map [^NodeTemplateAggregatedList$Builder this]
    (-> this (.getItemsMap))))

(defn put-all-items
  "A list of NodeTemplatesScopedList resources. The key for the map is: [Output Only] Name of
   the scope containing this set of node templates.

  items - `java.util.Map`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^java.util.Map items]
    (-> this (.putAllItems items))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList [^NodeTemplateAggregatedList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateAggregatedList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeTemplateAggregatedList`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^com.google.cloud.compute.v1.NodeTemplateAggregatedList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateAggregatedList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateAggregatedList$Builder [^NodeTemplateAggregatedList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

