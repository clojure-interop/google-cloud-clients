(ns com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UsableSubnetworksAggregatedList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#usableSubnetworksAggregatedList for aggregated
   lists of usable subnetworks.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.getKind))))

(defn add-all-items
  "[Output] A list of usable subnetwork URLs.

  items - `java.util.List`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^java.util.List items]
    (-> this (.addAllItems items))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#usableSubnetworksAggregatedList for aggregated
   lists of usable subnetworks.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

(defn get-items-list
  "[Output] A list of usable subnetwork URLs.

  returns: `java.util.List<com.google.cloud.compute.v1.UsableSubnetwork>`"
  (^java.util.List [^UsableSubnetworksAggregatedList$Builder this]
    (-> this (.getItemsList))))

(defn add-items
  "[Output] A list of usable subnetwork URLs.

  items - `com.google.cloud.compute.v1.UsableSubnetwork`

  returns: `com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.UsableSubnetworksAggregatedList$Builder [^UsableSubnetworksAggregatedList$Builder this ^com.google.cloud.compute.v1.UsableSubnetwork items]
    (-> this (.addItems items))))

