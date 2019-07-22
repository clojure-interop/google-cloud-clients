(ns com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient
  "Service Description: Cloud Web Security Scanner Service identifies security vulnerabilities in
  web applications hosted on Google Cloud Platform. It crawls your application, and attempts to
  exercise as many user inputs and event handlers as possible.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
    String formattedParent = WebSecurityScannerClient.formatProjectName(\"[PROJECT]\");
    ScanConfig scanConfig = ScanConfig.newBuilder().build();
    ScanConfig response = webSecurityScannerClient.createScanConfig(formattedParent, scanConfig);
  }

  Note: close() needs to be called on the webSecurityScannerClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of WebSecurityScannerSettings to
  create(). For example:

  To customize credentials:



  WebSecurityScannerSettings webSecurityScannerSettings =
      WebSecurityScannerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  WebSecurityScannerClient webSecurityScannerClient =
      WebSecurityScannerClient.create(webSecurityScannerSettings);

  To customize the endpoint:



  WebSecurityScannerSettings webSecurityScannerSettings =
      WebSecurityScannerSettings.newBuilder().setEndpoint(myEndpoint).build();
  WebSecurityScannerClient webSecurityScannerClient =
      WebSecurityScannerClient.create(webSecurityScannerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.websecurityscanner.v1beta WebSecurityScannerClient]))

(defn *parse-project-from-project-name
  "Deprecated. Use the ProjectName class instead.

  project-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project-name]
    (WebSecurityScannerClient/parseProjectFromProjectName project-name)))

(defn *parse-scan-run-from-finding-name
  "Deprecated. Use the FindingName class instead.

  finding-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String finding-name]
    (WebSecurityScannerClient/parseScanRunFromFindingName finding-name)))

(defn *parse-scan-run-from-scan-run-name
  "Deprecated. Use the ScanRunName class instead.

  scan-run-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scan-run-name]
    (WebSecurityScannerClient/parseScanRunFromScanRunName scan-run-name)))

(defn *parse-project-from-scan-config-name
  "Deprecated. Use the ScanConfigName class instead.

  scan-config-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scan-config-name]
    (WebSecurityScannerClient/parseProjectFromScanConfigName scan-config-name)))

(defn *parse-project-from-finding-name
  "Deprecated. Use the FindingName class instead.

  finding-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String finding-name]
    (WebSecurityScannerClient/parseProjectFromFindingName finding-name)))

(defn *format-project-name
  "Deprecated. Use the ProjectName class instead.

  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project]
    (WebSecurityScannerClient/formatProjectName project)))

(defn *parse-project-from-scan-run-name
  "Deprecated. Use the ScanRunName class instead.

  scan-run-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scan-run-name]
    (WebSecurityScannerClient/parseProjectFromScanRunName scan-run-name)))

(defn *format-scan-config-name
  "Deprecated. Use the ScanConfigName class instead.

  project - `java.lang.String`
  scan-config - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String scan-config]
    (WebSecurityScannerClient/formatScanConfigName project scan-config)))

(defn *parse-scan-config-from-scan-config-name
  "Deprecated. Use the ScanConfigName class instead.

  scan-config-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scan-config-name]
    (WebSecurityScannerClient/parseScanConfigFromScanConfigName scan-config-name)))

(defn *parse-finding-from-finding-name
  "Deprecated. Use the FindingName class instead.

  finding-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String finding-name]
    (WebSecurityScannerClient/parseFindingFromFindingName finding-name)))

(defn *format-finding-name
  "Deprecated. Use the FindingName class instead.

  project - `java.lang.String`
  scan-config - `java.lang.String`
  scan-run - `java.lang.String`
  finding - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String scan-config ^java.lang.String scan-run ^java.lang.String finding]
    (WebSecurityScannerClient/formatFindingName project scan-config scan-run finding)))

(defn *parse-scan-config-from-finding-name
  "Deprecated. Use the FindingName class instead.

  finding-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String finding-name]
    (WebSecurityScannerClient/parseScanConfigFromFindingName finding-name)))

(defn *create
  "Constructs an instance of WebSecurityScannerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient`

  throws: java.io.IOException"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient [^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings settings]
    (WebSecurityScannerClient/create settings))
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient []
    (WebSecurityScannerClient/create )))

(defn *parse-scan-config-from-scan-run-name
  "Deprecated. Use the ScanRunName class instead.

  scan-run-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scan-run-name]
    (WebSecurityScannerClient/parseScanConfigFromScanRunName scan-run-name)))

(defn *format-scan-run-name
  "Deprecated. Use the ScanRunName class instead.

  project - `java.lang.String`
  scan-config - `java.lang.String`
  scan-run - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String scan-config ^java.lang.String scan-run]
    (WebSecurityScannerClient/formatScanRunName project scan-config scan-run)))

(defn delete-scan-config
  "Deletes an existing ScanConfig and its child resources.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     webSecurityScannerClient.deleteScanConfig(formattedName);
   }

  name - Required. The resource name of the ScanConfig to be deleted. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^WebSecurityScannerClient this ^java.lang.String name]
    (-> this (.deleteScanConfig name))))

(defn get-scan-config-callable
  "Gets a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     GetScanConfigRequest request = GetScanConfigRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<ScanConfig> future = webSecurityScannerClient.getScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.getScanConfigCallable))))

(defn list-findings
  "List Findings under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     String filter = \"\";
     for (Finding element : webSecurityScannerClient.listFindings(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `java.lang.String`
  filter - The filter expression. The expression must be in the format: <field> <operator> <value>. Supported field: 'finding_type'. Supported operator: '='. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse [^WebSecurityScannerClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listFindings parent filter)))
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn update-scan-config-callable
  "Updates a ScanConfig. This method support partial update of a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateScanConfigRequest request = UpdateScanConfigRequest.newBuilder()
       .setScanConfig(scanConfig)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<ScanConfig> future = webSecurityScannerClient.updateScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.updateScanConfigCallable))))

(defn list-scan-runs-paged-callable
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ListScanRunsRequest request = ListScanRunsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListScanRunsPagedResponse> future = webSecurityScannerClient.listScanRunsPagedCallable().futureCall(request);
     // Do something
     for (ScanRun element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanRunsPagedCallable))))

(defn create-scan-config
  "Creates a new ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatProjectName(\"[PROJECT]\");
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     ScanConfig response = webSecurityScannerClient.createScanConfig(formattedParent, scanConfig);
   }

  parent - Required. The parent resource name where the scan is created, which should be a project resource name in the format 'projects/{projectId}'. - `java.lang.String`
  scan-config - Required. The ScanConfig to be created. - `com.google.cloud.websecurityscanner.v1beta.ScanConfig`

  returns: `com.google.cloud.websecurityscanner.v1beta.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ScanConfig [^WebSecurityScannerClient this ^java.lang.String parent ^com.google.cloud.websecurityscanner.v1beta.ScanConfig scan-config]
    (-> this (.createScanConfig parent scan-config)))
  (^com.google.cloud.websecurityscanner.v1beta.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest request]
    (-> this (.createScanConfig request))))

(defn list-crawled-urls-paged-callable
  "List CrawledUrls under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListCrawledUrlsRequest request = ListCrawledUrlsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListCrawledUrlsPagedResponse> future = webSecurityScannerClient.listCrawledUrlsPagedCallable().futureCall(request);
     // Do something
     for (CrawledUrl element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listCrawledUrlsPagedCallable))))

(defn list-finding-type-stats-callable
  "List all FindingTypeStats under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListFindingTypeStatsRequest request = ListFindingTypeStatsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListFindingTypeStatsResponse> future = webSecurityScannerClient.listFindingTypeStatsCallable().futureCall(request);
     // Do something
     ListFindingTypeStatsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listFindingTypeStatsCallable))))

(defn list-crawled-urls
  "List CrawledUrls under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     for (CrawledUrl element : webSecurityScannerClient.listCrawledUrls(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse [^WebSecurityScannerClient this ^java.lang.String parent]
    (-> this (.listCrawledUrls parent))))

(defn get-settings
  "returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings`"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings [^WebSecurityScannerClient this]
    (-> this (.getSettings))))

(defn list-findings-callable
  "List Findings under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     String filter = \"\";
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(formattedParent)
       .setFilter(filter)
       .build();
     while (true) {
       ListFindingsResponse response = webSecurityScannerClient.listFindingsCallable().call(request);
       for (Finding element : response.getFindingsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listFindingsCallable))))

(defn get-scan-run-callable
  "Gets a ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     GetScanRunRequest request = GetScanRunRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<ScanRun> future = webSecurityScannerClient.getScanRunCallable().futureCall(request);
     // Do something
     ScanRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.getScanRunCallable))))

(defn get-finding
  "Gets a Finding.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatFindingName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\", \"[FINDING]\");
     Finding response = webSecurityScannerClient.getFinding(formattedName);
   }

  name - Required. The resource name of the Finding to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}/findings/{findingId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.Finding`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.Finding [^WebSecurityScannerClient this ^java.lang.String name]
    (-> this (.getFinding name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStub`"
  ([^WebSecurityScannerClient this]
    (-> this (.getStub))))

(defn get-scan-config
  "Gets a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanConfig response = webSecurityScannerClient.getScanConfig(formattedName);
   }

  name - Required. The resource name of the ScanConfig to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ScanConfig [^WebSecurityScannerClient this ^java.lang.String name]
    (-> this (.getScanConfig name))))

(defn delete-scan-config-callable
  "Deletes an existing ScanConfig and its child resources.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     DeleteScanConfigRequest request = DeleteScanConfigRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = webSecurityScannerClient.deleteScanConfigCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.deleteScanConfigCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^WebSecurityScannerClient this]
    (-> this (.isShutdown))))

(defn list-scan-configs-callable
  "Lists ScanConfigs under a given project.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatProjectName(\"[PROJECT]\");
     ListScanConfigsRequest request = ListScanConfigsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListScanConfigsResponse response = webSecurityScannerClient.listScanConfigsCallable().call(request);
       for (ScanConfig element : response.getScanConfigsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanConfigsCallable))))

(defn list-finding-type-stats
  "List all FindingTypeStats under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListFindingTypeStatsResponse response = webSecurityScannerClient.listFindingTypeStats(formattedParent);
   }

  parent - Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse [^WebSecurityScannerClient this ^java.lang.String parent]
    (-> this (.listFindingTypeStats parent))))

(defn get-finding-callable
  "Gets a Finding.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatFindingName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\", \"[FINDING]\");
     GetFindingRequest request = GetFindingRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Finding> future = webSecurityScannerClient.getFindingCallable().futureCall(request);
     // Do something
     Finding response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,com.google.cloud.websecurityscanner.v1beta.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.getFindingCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^WebSecurityScannerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-crawled-urls-callable
  "List CrawledUrls under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ListCrawledUrlsRequest request = ListCrawledUrlsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListCrawledUrlsResponse response = webSecurityScannerClient.listCrawledUrlsCallable().call(request);
       for (CrawledUrl element : response.getCrawledUrlsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listCrawledUrlsCallable))))

(defn shutdown
  ""
  ([^WebSecurityScannerClient this]
    (-> this (.shutdown))))

(defn list-findings-paged-callable
  "List Findings under a given ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     String filter = \"\";
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(formattedParent)
       .setFilter(filter)
       .build();
     ApiFuture<ListFindingsPagedResponse> future = webSecurityScannerClient.listFindingsPagedCallable().futureCall(request);
     // Do something
     for (Finding element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listFindingsPagedCallable))))

(defn start-scan-run
  "Start a ScanRun according to the given ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanRun response = webSecurityScannerClient.startScanRun(formattedName);
   }

  name - Required. The resource name of the ScanConfig to be used. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.ScanRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ScanRun [^WebSecurityScannerClient this ^java.lang.String name]
    (-> this (.startScanRun name))))

(defn start-scan-run-callable
  "Start a ScanRun according to the given ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     StartScanRunRequest request = StartScanRunRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<ScanRun> future = webSecurityScannerClient.startScanRunCallable().futureCall(request);
     // Do something
     ScanRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.startScanRunCallable))))

(defn update-scan-config
  "Updates a ScanConfig. This method support partial update of a ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     ScanConfig response = webSecurityScannerClient.updateScanConfig(scanConfig, updateMask);
   }

  scan-config - Required. The ScanConfig to be updated. The name field must be set to identify the resource to be updated. The values of fields not covered by the mask will be ignored. - `com.google.cloud.websecurityscanner.v1beta.ScanConfig`
  update-mask - Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.websecurityscanner.v1beta.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1beta.ScanConfig scan-config ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateScanConfig scan-config update-mask)))
  (^com.google.cloud.websecurityscanner.v1beta.ScanConfig [^WebSecurityScannerClient this ^com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest request]
    (-> this (.updateScanConfig request))))

(defn close
  ""
  ([^WebSecurityScannerClient this]
    (-> this (.close))))

(defn list-scan-configs-paged-callable
  "Lists ScanConfigs under a given project.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatProjectName(\"[PROJECT]\");
     ListScanConfigsRequest request = ListScanConfigsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListScanConfigsPagedResponse> future = webSecurityScannerClient.listScanConfigsPagedCallable().futureCall(request);
     // Do something
     for (ScanConfig element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanConfigsPagedCallable))))

(defn list-scan-runs
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     for (ScanRun element : webSecurityScannerClient.listScanRuns(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a scan resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse [^WebSecurityScannerClient this ^java.lang.String parent]
    (-> this (.listScanRuns parent))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^WebSecurityScannerClient this]
    (-> this (.isTerminated))))

(defn get-scan-run
  "Gets a ScanRun.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ScanRun response = webSecurityScannerClient.getScanRun(formattedName);
   }

  name - Required. The resource name of the ScanRun to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.ScanRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ScanRun [^WebSecurityScannerClient this ^java.lang.String name]
    (-> this (.getScanRun name))))

(defn stop-scan-run-callable
  "Stops a ScanRun. The stopped ScanRun is returned.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     StopScanRunRequest request = StopScanRunRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<ScanRun> future = webSecurityScannerClient.stopScanRunCallable().futureCall(request);
     // Do something
     ScanRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,com.google.cloud.websecurityscanner.v1beta.ScanRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.stopScanRunCallable))))

(defn list-scan-configs
  "Lists ScanConfigs under a given project.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatProjectName(\"[PROJECT]\");
     for (ScanConfig element : webSecurityScannerClient.listScanConfigs(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, which should be a project resource name in the format 'projects/{projectId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse [^WebSecurityScannerClient this ^java.lang.String parent]
    (-> this (.listScanConfigs parent))))

(defn stop-scan-run
  "Stops a ScanRun. The stopped ScanRun is returned.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedName = WebSecurityScannerClient.formatScanRunName(\"[PROJECT]\", \"[SCAN_CONFIG]\", \"[SCAN_RUN]\");
     ScanRun response = webSecurityScannerClient.stopScanRun(formattedName);
   }

  name - Required. The resource name of the ScanRun to be stopped. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. - `java.lang.String`

  returns: `com.google.cloud.websecurityscanner.v1beta.ScanRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.websecurityscanner.v1beta.ScanRun [^WebSecurityScannerClient this ^java.lang.String name]
    (-> this (.stopScanRun name))))

(defn create-scan-config-callable
  "Creates a new ScanConfig.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatProjectName(\"[PROJECT]\");
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     CreateScanConfigRequest request = CreateScanConfigRequest.newBuilder()
       .setParent(formattedParent)
       .setScanConfig(scanConfig)
       .build();
     ApiFuture<ScanConfig> future = webSecurityScannerClient.createScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,com.google.cloud.websecurityscanner.v1beta.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.createScanConfigCallable))))

(defn shutdown-now
  ""
  ([^WebSecurityScannerClient this]
    (-> this (.shutdownNow))))

(defn list-scan-runs-callable
  "Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.

   Sample code:



   try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
     String formattedParent = WebSecurityScannerClient.formatScanConfigName(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ListScanRunsRequest request = ListScanRunsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListScanRunsResponse response = webSecurityScannerClient.listScanRunsCallable().call(request);
       for (ScanRun element : response.getScanRunsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WebSecurityScannerClient this]
    (-> this (.listScanRunsCallable))))

