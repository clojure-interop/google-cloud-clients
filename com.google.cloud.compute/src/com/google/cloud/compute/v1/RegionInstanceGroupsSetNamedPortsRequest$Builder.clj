(ns com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupsSetNamedPortsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^RegionInstanceGroupsSetNamedPortsRequest$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest other]
    (-> this (.mergeFrom other))))

(defn get-fingerprint
  "The fingerprint of the named ports information for this instance group. Use this optional
   property to prevent conflicts when multiple users change the named ports settings
   concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the
   fingerprint in your request to ensure that you do not overwrite changes that were applied
   from another concurrent request.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.getFingerprint))))

(defn set-fingerprint
  "The fingerprint of the named ports information for this instance group. Use this optional
   property to prevent conflicts when multiple users change the named ports settings
   concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the
   fingerprint in your request to ensure that you do not overwrite changes that were applied
   from another concurrent request.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^RegionInstanceGroupsSetNamedPortsRequest$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn get-named-ports-list
  "The list of named ports to set for this instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^RegionInstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.getNamedPortsList))))

(defn add-all-named-ports
  "The list of named ports to set for this instance group.

  named-ports - `java.util.List`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^RegionInstanceGroupsSetNamedPortsRequest$Builder this ^java.util.List named-ports]
    (-> this (.addAllNamedPorts named-ports))))

(defn add-named-ports
  "The list of named ports to set for this instance group.

  named-ports - `com.google.cloud.compute.v1.NamedPort`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^RegionInstanceGroupsSetNamedPortsRequest$Builder this ^com.google.cloud.compute.v1.NamedPort named-ports]
    (-> this (.addNamedPorts named-ports))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest [^RegionInstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^RegionInstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.clone))))

