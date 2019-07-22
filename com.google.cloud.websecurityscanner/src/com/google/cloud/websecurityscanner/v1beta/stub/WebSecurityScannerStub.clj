(ns com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStub
  "Base stub class for Web Security Scanner API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1beta.stub WebSecurityScannerStub]))

(defn ->web-security-scanner-stub
  "Constructor."
  (^WebSecurityScannerStub []
    (new WebSecurityScannerStub )))

(defn get-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.getScanConfigCallable))))

(defn update-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.updateScanConfigCallable))))

(defn list-scan-runs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanRunsPagedCallable))))

(defn list-crawled-urls-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listCrawledUrlsPagedCallable))))

(defn list-finding-type-stats-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listFindingTypeStatsCallable))))

(defn list-findings-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listFindingsCallable))))

(defn get-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.getScanRunCallable))))

(defn delete-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.deleteScanConfigCallable))))

(defn list-scan-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanConfigsCallable))))

(defn get-finding-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,com.google.cloud.websecurityscanner.v1beta.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.getFindingCallable))))

(defn list-crawled-urls-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listCrawledUrlsCallable))))

(defn list-findings-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listFindingsPagedCallable))))

(defn start-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.startScanRunCallable))))

(defn close
  ""
  ([^WebSecurityScannerStub this]
    (-> this (.close))))

(defn list-scan-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanConfigsPagedCallable))))

(defn stop-scan-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.stopScanRunCallable))))

(defn create-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.createScanConfigCallable))))

(defn list-scan-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerStub this]
    (-> this (.listScanRunsCallable))))

