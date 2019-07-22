(ns com.google.cloud.compute.v1.RouterNat$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterNat$Builder]))

(defn add-subnetworks
  "A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.

  subnetworks - `com.google.cloud.compute.v1.RouterNatSubnetworkToNat`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^com.google.cloud.compute.v1.RouterNatSubnetworkToNat subnetworks]
    (-> this (.addSubnetworks subnetworks))))

(defn set-tcp-transitory-idle-timeout-sec
  "Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.

  tcp-transitory-idle-timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.Integer tcp-transitory-idle-timeout-sec]
    (-> this (.setTcpTransitoryIdleTimeoutSec tcp-transitory-idle-timeout-sec))))

(defn add-nat-ips
  "A list of URLs of the IP resources used for this Nat service. These IP addresses must be
   valid static external IP addresses assigned to the project.

  nat-ips - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.String nat-ips]
    (-> this (.addNatIps nat-ips))))

(defn set-min-ports-per-vm
  "Minimum number of ports allocated to a VM from this NAT config. If not set, a default number
   of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if
   the value of this field is 50, at least 64 ports are allocated to a VM.

  min-ports-per-vm - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.Integer min-ports-per-vm]
    (-> this (.setMinPortsPerVm min-ports-per-vm))))

(defn add-all-nat-ips
  "A list of URLs of the IP resources used for this Nat service. These IP addresses must be
   valid static external IP addresses assigned to the project.

  nat-ips - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.util.List nat-ips]
    (-> this (.addAllNatIps nat-ips))))

(defn get-udp-idle-timeout-sec
  "Timeout (in seconds) for UDP connections. Defaults to 30s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat$Builder this]
    (-> this (.getUdpIdleTimeoutSec))))

(defn get-tcp-transitory-idle-timeout-sec
  "Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat$Builder this]
    (-> this (.getTcpTransitoryIdleTimeoutSec))))

(defn get-min-ports-per-vm
  "Minimum number of ports allocated to a VM from this NAT config. If not set, a default number
   of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if
   the value of this field is 50, at least 64 ports are allocated to a VM.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat$Builder this]
    (-> this (.getMinPortsPerVm))))

(defn set-name
  "Unique name of this Nat service. The name must be 1-63 characters long and comply with
   RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-nat-ip-allocate-option
  "Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   Uses only Nat IP addresses provided by customers. When there are not enough specified Nat
   IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud
   Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be
   empty.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNat$Builder this]
    (-> this (.getNatIpAllocateOption))))

(defn get-subnetworks-list
  "A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterNatSubnetworkToNat>`"
  (^java.util.List [^RouterNat$Builder this]
    (-> this (.getSubnetworksList))))

(defn get-name
  "Unique name of this Nat service. The name must be 1-63 characters long and comply with
   RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNat$Builder this]
    (-> this (.getName))))

(defn set-tcp-established-idle-timeout-sec
  "Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.

  tcp-established-idle-timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.Integer tcp-established-idle-timeout-sec]
    (-> this (.setTcpEstablishedIdleTimeoutSec tcp-established-idle-timeout-sec))))

(defn set-source-subnetwork-ip-ranges-to-nat
  "Specify the Nat option, which can take one of the following values: -
   ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED.
   Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
   ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section
   in any Router for this network in this region.

  source-subnetwork-ip-ranges-to-nat - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.String source-subnetwork-ip-ranges-to-nat]
    (-> this (.setSourceSubnetworkIpRangesToNat source-subnetwork-ip-ranges-to-nat))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterNat`"
  (^com.google.cloud.compute.v1.RouterNat [^RouterNat$Builder this]
    (-> this (.build))))

(defn set-nat-ip-allocate-option
  "Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   Uses only Nat IP addresses provided by customers. When there are not enough specified Nat
   IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud
   Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be
   empty.

  nat-ip-allocate-option - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.String nat-ip-allocate-option]
    (-> this (.setNatIpAllocateOption nat-ip-allocate-option))))

(defn set-icmp-idle-timeout-sec
  "Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.

  icmp-idle-timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.Integer icmp-idle-timeout-sec]
    (-> this (.setIcmpIdleTimeoutSec icmp-idle-timeout-sec))))

(defn get-icmp-idle-timeout-sec
  "Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat$Builder this]
    (-> this (.getIcmpIdleTimeoutSec))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterNat`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^com.google.cloud.compute.v1.RouterNat other]
    (-> this (.mergeFrom other))))

(defn add-all-subnetworks
  "A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.

  subnetworks - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.util.List subnetworks]
    (-> this (.addAllSubnetworks subnetworks))))

(defn get-source-subnetwork-ip-ranges-to-nat
  "Specify the Nat option, which can take one of the following values: -
   ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED.
   Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
   ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section
   in any Router for this network in this region.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterNat$Builder this]
    (-> this (.getSourceSubnetworkIpRangesToNat))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this]
    (-> this (.clone))))

(defn get-tcp-established-idle-timeout-sec
  "Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterNat$Builder this]
    (-> this (.getTcpEstablishedIdleTimeoutSec))))

(defn get-nat-ips-list
  "A list of URLs of the IP resources used for this Nat service. These IP addresses must be
   valid static external IP addresses assigned to the project.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterNat$Builder this]
    (-> this (.getNatIpsList))))

(defn set-udp-idle-timeout-sec
  "Timeout (in seconds) for UDP connections. Defaults to 30s if not set.

  udp-idle-timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^java.lang.Integer udp-idle-timeout-sec]
    (-> this (.setUdpIdleTimeoutSec udp-idle-timeout-sec))))

(defn get-log-config
  "Configure logging on this NAT.

  returns: `com.google.cloud.compute.v1.RouterNatLogConfig`"
  (^com.google.cloud.compute.v1.RouterNatLogConfig [^RouterNat$Builder this]
    (-> this (.getLogConfig))))

(defn set-log-config
  "Configure logging on this NAT.

  log-config - `com.google.cloud.compute.v1.RouterNatLogConfig`

  returns: `com.google.cloud.compute.v1.RouterNat$Builder`"
  (^com.google.cloud.compute.v1.RouterNat$Builder [^RouterNat$Builder this ^com.google.cloud.compute.v1.RouterNatLogConfig log-config]
    (-> this (.setLogConfig log-config))))

