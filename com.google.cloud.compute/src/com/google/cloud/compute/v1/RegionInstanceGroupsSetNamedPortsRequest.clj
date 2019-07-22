(ns com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupsSetNamedPortsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest prototype]
    (RegionInstanceGroupsSetNamedPortsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder []
    (RegionInstanceGroupsSetNamedPortsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest []
    (RegionInstanceGroupsSetNamedPortsRequest/getDefaultInstance )))

(defn get-fingerprint
  "The fingerprint of the named ports information for this instance group. Use this optional
   property to prevent conflicts when multiple users change the named ports settings concurrently.
   Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   your request to ensure that you do not overwrite changes that were applied from another
   concurrent request.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupsSetNamedPortsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-named-ports-list
  "The list of named ports to set for this instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.getNamedPortsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupsSetNamedPortsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest$Builder [^RegionInstanceGroupsSetNamedPortsRequest this]
    (-> this (.toBuilder))))

