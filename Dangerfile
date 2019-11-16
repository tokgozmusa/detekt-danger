kotlin_files = (git.added_files + git.modified_files).select {
  | file | file.end_with ? (".kt", ".kts")
}

unless kotlin_files.empty?
  comma_separated_kotlin_files = kotlin_files.join(",")

  detekt_report_file = "./build/detekt/reports/detekt.xml"

  puts `./gradlew detektOnFiles -PkotlinFiles=#{comma_separated_kotlin_files}`

  checkstyle_format.base_path = Dir.pwd
  checkstyle_format.report detekt_report_file
end
