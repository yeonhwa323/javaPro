package days13;

import days14.Time;
//import days14.Student;
import days14.Tv;

public class Ex01 {

	public static void main(String[] args) {
		
		Time t = new Time();
		t.hour = 1;
		
		
		Tv tv1 = new Tv();
		//Student s1 = new Student(); // 
		
		// 1. Git 개요
		// 2. GitHub 계정 생성
		// 3. Git 설치			- https://git-scm.com/
		// 4. New Repository	- javaPro
		// 5. token : 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 [SampleToken]
		// 6. F:\쌍용\Class\Workspace\JavaClass - Home ( 집 )
		// 6. F:\쌍용\Class\Workspace\JavaClass - Sist ( 교육원 )
		// 7. Git 사용자 등록
		// < open git Bash here >
		// $ git config --global user.name "사용자이름"
		// $ git config --global user.email "사용자이메일"
		// 7-2. $ git config user.name
		// 7-2. $ git config user.email
		// 7-2. $ git config -l
		/*
		$ git config -l
		diff.astextplain.textconv=astextplain
		filter.lfs.clean=git-lfs clean -- %f
		filter.lfs.smudge=git-lfs smudge -- %f
		filter.lfs.process=git-lfs filter-process
		filter.lfs.required=true
		http.sslbackend=openssl
		http.sslcainfo=C:/Program Files/Git/mingw64/etc/ssl/certs/ca-bundle.crt
		core.autocrlf=true
		core.fscache=true
		core.symlinks=false
		pull.rebase=false
		credential.helper=manager
		credential.https://dev.azure.com.usehttppath=true
		init.defaultbranch=master
		user.name=yeonhwa323
		user.email=dusk323@naver.com
		 */

		// 8. 원격 저장소 등록 확인.
		// $ git remote -v
		// fatal: not a git repository (or any of the parent directories): .git

		// 9. 로컬 저장소 생성
		// $ git init
		// Initialized empty Git repository in F:/쌍용/Class/Workspace/JavaClass - Sist/.git/
		//  s-SiSt/.git/

		// 10. ls
		// user
		// $ ls
		// Hello.java 여기까지함

		// 11. java project : gitPro
		// 11-2.	.gitignore 파일 확인	/.metadata/

		// 12. 깃 상태 확인 -> 복붙만 함 다시하기
		// $ git status
		//		On branch main
		//
		//		No commits yet
		//
		//		Untracked files:
		//		  (use "git add <file>..." to include in what will be committed)
		//		        .gitignore
		//		        Hello.java
		//		        gitPro/
		//
		//		nothing added to commit but untracked files present (use "git add" to tra
		//		ck)

		// 13. 다시 원격저장소 확인 -> 원격저장소 등록
		// https://github.com/yeonhwa323/javaPro.git
		// $ git remote add origin https://github.com/yeonhwa323/javaPro.git
		// 13-2.
		// $ git remote -v
		// origin (fetch)
		// origin (push)

		/*
		$ git add -h
		usage: git add [<options>] [--] <pathspec>...

		    -n, --dry-run         dry run
		    -v, --verbose         be verbose

		    -i, --interactive     interactive picking
		    -p, --patch           select hunks interactively
		    -e, --edit            edit current diff and apply
		    -f, --force           allow adding otherwise ignored files
		    -u, --update          update tracked files
		    --renormalize         renormalize EOL of tracked files (implies -u)
		    -N, --intent-to-add   record only the fact that the path will be adde
		d later
		    -A, --all             add changes from all tracked and untracked file
		s
		    --ignore-removal      ignore paths removed in the working tree (same
		as --no-all)
		    --refresh             don't add, only refresh the index
		    --ignore-errors       just skip files which cannot be added because o
		f errors
		    --ignore-missing      check if - even missing - files are ignored in
		dry run
		    --sparse              allow updating entries outside of the sparse-ch
		eckout cone
		    --chmod (+|-)x        override the executable bit of the listed files
		    --pathspec-from-file <file>
		                          read pathspec from file
		    --pathspec-file-nul   with --pathspec-from-file, pathspec elements ar
		e separated with NUL character
		 */

		// 14. 스테이징 영역 추가
		// $ git add .

		/*
		$ git status
		On branch main

		No commits yet

		Changes to be committed:
		  (use "git rm --cached <file>..." to unstage)
		        new file:   .gitignore
		        new file:   Hello.java
		        new file:   gitPro/.classpath
		        new file:   gitPro/.gitignore
		        new file:   gitPro/.project
		        new file:   gitPro/src/gitPro/Sample.java
		 */


		// 15. 로컬 저장소 ( git directory ) 추가
		// $ git commit -m "first javaPro commit"


		// 16. 원격 저장소 추가.
		// $ git push
		//		git push 부분 복사
		// $ git push --set-upstream origin main

		// 17. JavaClass-Sist( 교육원 ) -> 원격저장소
		// $ git push --set-upstream origin main
		// $ git status

		// -- [집] -- JavaClass-Home 폴더(집)
		// 1) F:\쌍용\Class\Workspace\JavaClass - Home 폴더이동
		// 2) Git Repository(깃 로컬 저장소 ) 생성
		//		git init X
		//		git clone
		//
		//		$ git clone https://github.com/yeonhwa323/javaPro.git JavaClass
		//			Cloning into 'JavaClass'...
		//			warning: You appear to have cloned an empty repository.

		// git config user.name, user.email 등록
		// git remote - origin ~~~ 원격저장소도 orgin 별칭으로 등록


		// *** [이클립스 + git명령어 ] ***
		// 1. JavaClass-SiSt 폴더 ( 교육원 )
		//     ㄴ 바로 이클립스 실행....
		//        gitPro 자바프로젝트 생성
		// 2. GitHub
		//        javaPro  원격저장소 생성
		// 3. javaPro 원격저장소를 복제(clone)
		//  https://github.com/withkenik/javaPro.git 반드시 먼저 복사.		
		// 3-2. C:\Users/user\git\javaPro 로컬 저장소 설정
		//          ㄴ .git 폴더
		//          ㄴ 원격 저장소로부터 복제한 폴더,파일 
		// 4. 충돌 처리 + merge
		
		////// 집 //////

	}// main

}// class

