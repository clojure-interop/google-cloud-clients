(ns com.google.cloud.compute.v1.SubnetworksScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworksScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SubnetworksScopedList`

  returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^SubnetworksScopedList$Builder this ^com.google.cloud.compute.v1.SubnetworksScopedList other]
    (-> this (.mergeFrom other))))

(defn get-subnetworks-list
  "A list of subnetworks contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Subnetwork>`"
  (^java.util.List [^SubnetworksScopedList$Builder this]
    (-> this (.getSubnetworksList))))

(defn add-all-subnetworks
  "A list of subnetworks contained in this scope.

  subnetworks - `java.util.List`

  returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^SubnetworksScopedList$Builder this ^java.util.List subnetworks]
    (-> this (.addAllSubnetworks subnetworks))))

(defn add-subnetworks
  "A list of subnetworks contained in this scope.

  subnetworks - `com.google.cloud.compute.v1.Subnetwork`

  returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^SubnetworksScopedList$Builder this ^com.google.cloud.compute.v1.Subnetwork subnetworks]
    (-> this (.addSubnetworks subnetworks))))

(defn get-warning
  "An informational warning that appears when the list of addresses is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SubnetworksScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "An informational warning that appears when the list of addresses is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^SubnetworksScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.SubnetworksScopedList`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList [^SubnetworksScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^SubnetworksScopedList$Builder this]
    (-> this (.clone))))

