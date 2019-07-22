(ns com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceWithNamedPorts$Builder]))

(defn get-status
  "[Output Only] The status of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceWithNamedPorts$Builder this]
    (-> this (.getStatus))))

(defn get-instance
  "[Output Only] The URL of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceWithNamedPorts$Builder this]
    (-> this (.getInstance))))

(defn get-named-ports-list
  "[Output Only] The named ports that belong to this instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^InstanceWithNamedPorts$Builder this]
    (-> this (.getNamedPortsList))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts [^InstanceWithNamedPorts$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceWithNamedPorts`

  returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts$Builder this ^com.google.cloud.compute.v1.InstanceWithNamedPorts other]
    (-> this (.mergeFrom other))))

(defn set-instance
  "[Output Only] The URL of the instance.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts$Builder this]
    (-> this (.clone))))

(defn add-named-ports
  "[Output Only] The named ports that belong to this instance group.

  named-ports - `com.google.cloud.compute.v1.NamedPort`

  returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts$Builder this ^com.google.cloud.compute.v1.NamedPort named-ports]
    (-> this (.addNamedPorts named-ports))))

(defn set-status
  "[Output Only] The status of the instance.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn add-all-named-ports
  "[Output Only] The named ports that belong to this instance group.

  named-ports - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder`"
  (^com.google.cloud.compute.v1.InstanceWithNamedPorts$Builder [^InstanceWithNamedPorts$Builder this ^java.util.List named-ports]
    (-> this (.addAllNamedPorts named-ports))))

