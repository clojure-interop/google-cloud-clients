(ns com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsSetNamedPortsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest prototype]
    (InstanceGroupsSetNamedPortsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder []
    (InstanceGroupsSetNamedPortsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest []
    (InstanceGroupsSetNamedPortsRequest/getDefaultInstance )))

(defn get-fingerprint
  "The fingerprint of the named ports information for this instance group. Use this optional
   property to prevent conflicts when multiple users change the named ports settings concurrently.
   Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in
   your request to ensure that you do not overwrite changes that were applied from another
   concurrent request. A request with an incorrect fingerprint will fail with error 412
   conditionNotMet.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupsSetNamedPortsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-named-ports-list
  "The list of named ports to set for this instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.getNamedPortsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupsSetNamedPortsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest$Builder [^InstanceGroupsSetNamedPortsRequest this]
    (-> this (.toBuilder))))

