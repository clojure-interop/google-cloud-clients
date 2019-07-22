(ns com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VmEndpointNatMappingsInterfaceNatMappings$Builder]))

(defn get-source-virtual-ip
  "Primary IP of the VM for this NIC.

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsInterfaceNatMappings$Builder this]
    (-> this (.getSourceVirtualIp))))

(defn get-nat-ip-port-ranges-list
  "A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   that is, both the first and the last ports can be used for NAT. Example:
   [\"2.2.2.2:12345-12355\", \"1.1.1.1:2234-2234\"].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VmEndpointNatMappingsInterfaceNatMappings$Builder this]
    (-> this (.getNatIpPortRangesList))))

(defn add-all-nat-ip-port-ranges
  "A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   that is, both the first and the last ports can be used for NAT. Example:
   [\"2.2.2.2:12345-12355\", \"1.1.1.1:2234-2234\"].

  nat-ip-port-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this ^java.util.List nat-ip-port-ranges]
    (-> this (.addAllNatIpPortRanges nat-ip-port-ranges))))

(defn set-num-total-nat-ports
  "Total number of ports across all NAT IPs allocated to this interface. It equals to the
   aggregated port number in the field nat_ip_port_ranges.

  num-total-nat-ports - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this ^java.lang.Integer num-total-nat-ports]
    (-> this (.setNumTotalNatPorts num-total-nat-ports))))

(defn build
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings [^VmEndpointNatMappingsInterfaceNatMappings$Builder this]
    (-> this (.build))))

(defn set-source-virtual-ip
  "Primary IP of the VM for this NIC.

  source-virtual-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this ^java.lang.String source-virtual-ip]
    (-> this (.setSourceVirtualIp source-virtual-ip))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this ^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings other]
    (-> this (.mergeFrom other))))

(defn get-source-alias-ip-range
  "Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range.
   Examples: \"10.33.4.55/32\", or \"192.168.5.0/24\".

  returns: `java.lang.String`"
  (^java.lang.String [^VmEndpointNatMappingsInterfaceNatMappings$Builder this]
    (-> this (.getSourceAliasIpRange))))

(defn clone
  "returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this]
    (-> this (.clone))))

(defn set-source-alias-ip-range
  "Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range.
   Examples: \"10.33.4.55/32\", or \"192.168.5.0/24\".

  source-alias-ip-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this ^java.lang.String source-alias-ip-range]
    (-> this (.setSourceAliasIpRange source-alias-ip-range))))

(defn get-num-total-nat-ports
  "Total number of ports across all NAT IPs allocated to this interface. It equals to the
   aggregated port number in the field nat_ip_port_ranges.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^VmEndpointNatMappingsInterfaceNatMappings$Builder this]
    (-> this (.getNumTotalNatPorts))))

(defn add-nat-ip-port-ranges
  "A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   that is, both the first and the last ports can be used for NAT. Example:
   [\"2.2.2.2:12345-12355\", \"1.1.1.1:2234-2234\"].

  nat-ip-port-ranges - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder`"
  (^com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings$Builder [^VmEndpointNatMappingsInterfaceNatMappings$Builder this ^java.lang.String nat-ip-port-ranges]
    (-> this (.addNatIpPortRanges nat-ip-port-ranges))))

