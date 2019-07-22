(ns com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsSetNamedPortsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^InstanceGroupsSetNamedPortsRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest other]
    (-> this (.mergeFrom other))))

(defn get-fingerprint
  "The fingerprint of the named ports information for this instance group. Use this optional
   property to prevent conflicts when multiple users change the named ports settings
   concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the
   fingerprint in your request to ensure that you do not overwrite changes that were applied
   from another concurrent request. A request with an incorrect fingerprint will fail with error
   412 conditionNotMet.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.getFingerprint))))

(defn set-fingerprint
  "The fingerprint of the named ports information for this instance group. Use this optional
   property to prevent conflicts when multiple users change the named ports settings
   concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the
   fingerprint in your request to ensure that you do not overwrite changes that were applied
   from another concurrent request. A request with an incorrect fingerprint will fail with error
   412 conditionNotMet.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^InstanceGroupsSetNamedPortsRequest$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn get-named-ports-list
  "The list of named ports to set for this instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^InstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.getNamedPortsList))))

(defn add-all-named-ports
  "The list of named ports to set for this instance group.

  named-ports - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^InstanceGroupsSetNamedPortsRequest$Builder this ^java.util.List named-ports]
    (-> this (.addAllNamedPorts named-ports))))

(defn add-named-ports
  "The list of named ports to set for this instance group.

  named-ports - `com.google.cloud.compute.v1.NamedPort`

  returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^InstanceGroupsSetNamedPortsRequest$Builder this ^com.google.cloud.compute.v1.NamedPort named-ports]
    (-> this (.addNamedPorts named-ports))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest [^InstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^InstanceGroupsSetNamedPortsRequest$Builder this]
    (-> this (.clone))))

