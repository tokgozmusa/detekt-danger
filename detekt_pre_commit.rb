kotlin_files = `git diff --name-only --cached --diff-filter=ACMR "*.kt" "*.kts"`.strip.split("\n")

unless kotlin_files.empty?
  comma_separated_kotlin_files = kotlin_files.join(",")
  detekt_check = system("./gradlew detektOnFiles -PkotlinFiles=#{comma_separated_kotlin_files}")
  if detekt_check == false
    exit 1
  end
end
