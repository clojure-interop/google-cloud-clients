(ns com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^NetworkEndpointGroupsScopedList$Builder this ^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-network-endpoint-groups-list
  "[Output Only] The list of network endpoint groups that are contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^java.util.List [^NetworkEndpointGroupsScopedList$Builder this]
    (-> this (.getNetworkEndpointGroupsList))))

(defn add-all-network-endpoint-groups
  "[Output Only] The list of network endpoint groups that are contained in this scope.

  network-endpoint-groups - `java.util.List`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^NetworkEndpointGroupsScopedList$Builder this ^java.util.List network-endpoint-groups]
    (-> this (.addAllNetworkEndpointGroups network-endpoint-groups))))

(defn add-network-endpoint-groups
  "[Output Only] The list of network endpoint groups that are contained in this scope.

  network-endpoint-groups - `com.google.cloud.compute.v1.NetworkEndpointGroup`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^NetworkEndpointGroupsScopedList$Builder this ^com.google.cloud.compute.v1.NetworkEndpointGroup network-endpoint-groups]
    (-> this (.addNetworkEndpointGroups network-endpoint-groups))))

(defn get-warning
  "[Output Only] An informational warning that replaces the list of network endpoint groups when
   the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NetworkEndpointGroupsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that replaces the list of network endpoint groups when
   the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^NetworkEndpointGroupsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList [^NetworkEndpointGroupsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList$Builder [^NetworkEndpointGroupsScopedList$Builder this]
    (-> this (.clone))))

