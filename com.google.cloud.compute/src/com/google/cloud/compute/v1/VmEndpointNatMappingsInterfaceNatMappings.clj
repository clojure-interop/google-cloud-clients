(ns com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VmEndpointNatMappingsInterfaceNatMappings]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings prototype]
    (VmEndpointNatMappingsInterfaceNatMappings/newBuilder prototype))
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder []
    (VmEndpointNatMappingsInterfaceNatMappings/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings []
    (VmEndpointNatMappingsInterfaceNatMappings/getDefaultInstance )))

(defn get-source-virtual-ip
  "Primary IP of the VM for this NIC.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.getSourceVirtualIp))))

(defn get-nat-ip-port-ranges-list
  "A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   that is, both the first and the last ports can be used for NAT. Example:
   [\"2.2.2.2:12345-12355\", \"1.1.1.1:2234-2234\"].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.getNatIpPortRangesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^VmEndpointNatMappingsInterfaceNatMappings this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.getApiMessageRequestBody))))

(defn get-source-alias-ip-range
  "Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples:
   \"10.33.4.55/32\", or \"192.168.5.0/24\".

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.getSourceAliasIpRange))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.hashCode))))

(defn get-num-total-nat-ports
  "Total number of ports across all NAT IPs allocated to this interface. It equals to the
   aggregated port number in the field nat_ip_port_ranges.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.getNumTotalNatPorts))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VmEndpointNatMappingsInterfaceNatMappings this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings this]
    (-> this (.toBuilder))))

