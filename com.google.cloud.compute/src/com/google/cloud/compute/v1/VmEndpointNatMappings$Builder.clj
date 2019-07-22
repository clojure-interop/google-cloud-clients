(ns com.google.cloud.compute.v1.VmEndpointNatMappings$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VmEndpointNatMappings$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.VmEndpointNatMappings`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^VmEndpointNatMappings$Builder this ^com.google.cloud.compute.v1.VmEndpointNatMappings other]
    (-> this (.mergeFrom other))))

(defn get-instance-name
  "Name of the VM instance which the endpoint belongs to

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappings$Builder this]
    (-> this (.getInstanceName))))

(defn set-instance-name
  "Name of the VM instance which the endpoint belongs to

  instance-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^VmEndpointNatMappings$Builder this ^java.lang.String instance-name]
    (-> this (.setInstanceName instance-name))))

(defn get-interface-nat-mappings-list
  "returns: `java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings>`"
  (^java.util.List [^VmEndpointNatMappings$Builder this]
    (-> this (.getInterfaceNatMappingsList))))

(defn add-all-interface-nat-mappings
  "interface-nat-mappings - `java.util.List`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^VmEndpointNatMappings$Builder this ^java.util.List interface-nat-mappings]
    (-> this (.addAllInterfaceNatMappings interface-nat-mappings))))

(defn add-interface-nat-mappings
  "interface-nat-mappings - `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^VmEndpointNatMappings$Builder this ^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings interface-nat-mappings]
    (-> this (.addInterfaceNatMappings interface-nat-mappings))))

(defn build
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappings`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings [^VmEndpointNatMappings$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappings$Builder [^VmEndpointNatMappings$Builder this]
    (-> this (.clone))))

