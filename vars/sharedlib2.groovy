def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Heyyprakhar1/${repo}.git"
}
def build()
{
  sh 'Python3'
}
