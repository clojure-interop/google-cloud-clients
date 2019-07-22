(ns com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGatewayAggregatedList$Builder]))

(defn get-warning
  "[Output Only] Informational warning message.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.getWarning))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.getKind))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-warning
  "[Output Only] Informational warning message.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn get-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.getNextPageToken))))

(defn set-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-items-map
  "A list of TargetVpnGateway resources. The key for the map is: [Output Only] Name of the scope
   containing this set of target VPN gateways.

  returns: `java.util.Map<java.lang.String,com.google.cloud.compute.v1.TargetVpnGatewaysScopedList>`"
  (^java.util.Map [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.getItemsMap))))

(defn put-all-items
  "A list of TargetVpnGateway resources. The key for the map is: [Output Only] Name of the scope
   containing this set of target VPN gateways.

  items - `java.util.Map`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^java.util.Map items]
    (-> this (.putAllItems items))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.build))))

(defn get-id
  "[Output Only] Unique identifier for the resource; defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this]
    (-> this (.clone))))

(defn set-next-page-token
  "[Output Only] This token allows you to get the next page of results for list requests. If the
   number of results is larger than maxResults, use the nextPageToken as a value for the query
   parameter pageToken in the next list request. Subsequent list requests will have their own
   nextPageToken to continue paging through the results.

  next-page-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList$Builder [^TargetVpnGatewayAggregatedList$Builder this ^java.lang.String next-page-token]
    (-> this (.setNextPageToken next-page-token))))

