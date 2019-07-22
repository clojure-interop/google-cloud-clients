(ns com.google.cloud.compute.v1.InstanceWithNamedPorts
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceWithNamedPorts]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceWithNamedPorts`

  returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^com.google.cloud.compute.v1.InstanceWithNamedPorts prototype]
    (InstanceWithNamedPorts/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder []
    (InstanceWithNamedPorts/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts []
    (InstanceWithNamedPorts/getDefaultInstance )))

(defn get-status
  "[Output Only] The status of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceWithNamedPorts this]
    (-> this (.getStatus))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceWithNamedPorts this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceWithNamedPorts this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceWithNamedPorts this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-instance
  "[Output Only] The URL of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceWithNamedPorts this]
    (-> this (.getInstance))))

(defn get-named-ports-list
  "[Output Only] The named ports that belong to this instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^InstanceWithNamedPorts this]
    (-> this (.getNamedPortsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceWithNamedPorts this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceWithNamedPorts this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceWithNamedPorts this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts this]
    (-> this (.toBuilder))))

