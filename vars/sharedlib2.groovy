def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Heyyprakhar1/${repo}.git"
}
def build()
{
  sh 'python3'
}
def deployement(jobname,ip){
  sh "scp /var/lib/jenkins/workspace/${jobname}/new.py ubuntu@${ip}:/home/ubuntu/new-folder"
}
