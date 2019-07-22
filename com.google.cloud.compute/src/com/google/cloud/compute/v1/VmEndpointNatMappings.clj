(ns com.google.cloud.compute.v1.VmEndpointNatMappings
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VmEndpointNatMappings]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.VmEndpointNatMappings`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^com.google.cloud.compute.v1.VmEndpointNatMappings prototype]
    (VmEndpointNatMappings/newBuilder prototype))
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder []
    (VmEndpointNatMappings/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappings`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings []
    (VmEndpointNatMappings/getDefaultInstance )))

(defn get-interface-nat-mappings-list
  "returns: `java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>`"
  (^java.util.List [^VmEndpointNatMappings this]
    (-> this (.getInterfaceNatMappingsList))))

(defn get-instance-name
  "Name of the VM instance which the endpoint belongs to

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappings this]
    (-> this (.getInstanceName))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VmEndpointNatMappings this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappings this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^VmEndpointNatMappings this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^VmEndpointNatMappings this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VmEndpointNatMappings this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VmEndpointNatMappings this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^VmEndpointNatMappings this]
    (-> this (.toBuilder))))

