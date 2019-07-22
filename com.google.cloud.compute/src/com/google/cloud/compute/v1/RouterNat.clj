(ns com.google.cloud.compute.v1.RouterNat
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterNat]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterNat`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^com.google.cloud.compute.v1.RouterNat prototype]
    (RouterNat/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterNat$Builder []
    (RouterNat/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterNat`"
  (^com.google.cloud.compute.v1.RouterNat []
    (RouterNat/getDefaultInstance )))

(defn get-udp-idle-timeout-sec
  "Timeout (in seconds) for UDP connections. Defaults to 30s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat this]
    (-> this (.getUdpIdleTimeoutSec))))

(defn get-tcp-transitory-idle-timeout-sec
  "Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat this]
    (-> this (.getTcpTransitoryIdleTimeoutSec))))

(defn get-min-ports-per-vm
  "Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of
   ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the
   value of this field is 50, at least 64 ports are allocated to a VM.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat this]
    (-> this (.getMinPortsPerVm))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNat this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterNat this]
    (-> this (.toString))))

(defn get-nat-ip-allocate-option
  "Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs,
   the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform;
   customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNat this]
    (-> this (.getNatIpAllocateOption))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterNat this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-subnetworks-list
  "A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterNatSubnetworkToNat>`"
  (^java.util.List [^RouterNat this]
    (-> this (.getSubnetworksList))))

(defn get-name
  "Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNat this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterNat this]
    (-> this (.getApiMessageRequestBody))))

(defn get-icmp-idle-timeout-sec
  "Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat this]
    (-> this (.getIcmpIdleTimeoutSec))))

(defn get-source-subnetwork-ip-ranges-to-nat
  "Specify the Nat option, which can take one of the following values: -
   ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note
   that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
   ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in
   any Router for this network in this region.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNat this]
    (-> this (.getSourceSubnetworkIpRangesToNat))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterNat this]
    (-> this (.hashCode))))

(defn get-tcp-established-idle-timeout-sec
  "Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat this]
    (-> this (.getTcpEstablishedIdleTimeoutSec))))

(defn get-nat-ips-list
  "A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid
   static external IP addresses assigned to the project.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNat this]
    (-> this (.getNatIpsList))))

(defn get-log-config
  "Configure logging on this NAT.

  returns: `com.google.cloud.compute.v1.RouterNatLogConfig`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig [^RouterNat this]
    (-> this (.getLogConfig))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterNat this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat this]
    (-> this (.toBuilder))))

